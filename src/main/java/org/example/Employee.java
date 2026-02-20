package org.example;

import java.util.Arrays;

public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    // 5 alanın hepsini set eden constructor
    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    // healthplans dizisine index'e göre name atar
    public void addHealthplan(int index, String name) {
        if (healthplans == null) {
            System.out.println("healthplans dizisi null. Önce dizi oluşturmalısın.");
            return;
        }

        if (index < 0 || index >= healthplans.length) {
            System.out.println("Geçersiz index! (index: " + index + ") Dizi boyutu: " + healthplans.length);
            return;
        }

        if (healthplans[index] == null) {
            healthplans[index] = name;
            System.out.println("Healthplan eklendi: index " + index + " -> " + name);
        } else {
            System.out.println("Bu index dolu! (index: " + index + ") Mevcut değer: " + healthplans[index]);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}