package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runTask3();
    }

    private static void runTask3() {

        HealthPlan hp1 = new HealthPlan(1L, "Default Health Plan", Plan.BASIC);


        Employee emp1 = new Employee(
                10L,
                "Yagmur Cimen",
                "yagmurgamzecimen@mail.com",
                "Aa1!aaaa",
                new String[3]
        );
        emp1.addHealthPlan(0, Plan.BASIC.name());
        emp1.addHealthPlan(0, Plan.VIP.name());
        emp1.addHealthPlan(5, "PREMIUM");


        Company company1 = new Company(
                100L,
                "Workintech",
                -5000,
                new String[2]
        );
        company1.addEmployee(0, emp1.getFullName());
        company1.addEmployee(0, "Başka İsim");
        company1.addEmployee(10, "Yeni İsim");


        System.out.println(hp1.toString());
        System.out.println(emp1.toString());
        System.out.println(company1.toString());


        System.out.println("Company giro (negatif olamaz): " + company1.getGiro());
    }
}