package com.test;

public class Salary {
    public static int getSum(Worker[] workers){
        int sum = 0;
        for(int i = 0; i < workers.length; i++){
            sum += workers[i].getSalary();
        }
        return sum;
    }
}
