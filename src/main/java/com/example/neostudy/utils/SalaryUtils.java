package com.example.neostudy.utils;

import java.math.BigDecimal;

public class SalaryUtils {
    public static double roundSalary(double salary) {
        BigDecimal result = new BigDecimal(salary).setScale(2,BigDecimal.ROUND_HALF_UP);
        return result.doubleValue();
    }
}
