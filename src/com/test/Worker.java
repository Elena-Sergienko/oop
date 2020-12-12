package com.test;

public class Worker extends Person {  //Inheritance

    private int baseSalary;

    public Worker(String name, int age, char sex, int baseSalary) {
        super(name, age, sex);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }
}
