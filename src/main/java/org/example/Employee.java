package org.example;

import java.util.Arrays;

public class Employee {

    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    // Employee'nin constructor'ı
    public Employee(Integer id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthplan(int index, String name) {
        if (healthPlans == null) {
            System.out.println("healthPlans dizisi null. Önce dizi oluşturmalısın.");
            return;
        }

        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index! (index: " + index + ") Dizi boyutu: " + healthPlans.length);
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Healthplan eklendi: index " + index + " -> " + name);
        } else {
            System.out.println("Bu index dolu! (index: " + index + ") Mevcut değer: " + healthPlans[index]);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}