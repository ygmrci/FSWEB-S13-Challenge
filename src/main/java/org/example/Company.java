package org.example;

import java.util.Arrays;

public class Company {

    private Integer id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(Integer id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);           // negatif kontrolü burada
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String employeeName) {
        if (developerNames == null) {
            System.out.println("developerNames dizisi null. Önce dizi oluşturmalısın.");
            return;
        }

        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index! (index: " + index + ") Dizi boyutu: " + developerNames.length);
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = employeeName;
            System.out.println("Employee eklendi: index " + index + " -> " + employeeName);
        } else {
            System.out.println("Bu index dolu! (index: " + index + ") Mevcut değer: " + developerNames[index]);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        // README: giro hiçbir zaman 0'ın altında olamaz
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}