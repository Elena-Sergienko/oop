package com.test;

public class Manager extends Worker{

    int countOfPeople;

    public  Manager(String name, int age, char sex, int baseSalary, int countOfPeople){
        super(name, age, sex, baseSalary);
        this.countOfPeople = countOfPeople;
    }

    public int getCountOfPeople(){
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople){
        this.countOfPeople = countOfPeople;
    }

    @Override                // polymorphism
    public int getSalary() {
        return (int)(getBaseSalary() + getBaseSalary() * (countOfPeople / 100.0));
    }
}
