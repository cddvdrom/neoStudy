package com.example.neostudy.validator;

public class SalaryValidator {
    public static void validate (double salary){
        if (salary<0){
            throw new AssertionError("Salary can`t be negative");
        }
    }
}
