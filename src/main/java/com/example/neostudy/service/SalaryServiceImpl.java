package com.example.neostudy.service;

import com.example.neostudy.utils.SalaryUtils;
import com.example.neostudy.validator.SalaryValidator;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    private static final double AVERAGE_DAYS = 29.3;
    public double getPayment(double salary, int days){
SalaryValidator.validate(salary);
        return SalaryUtils.roundSalary(salary/AVERAGE_DAYS*days);
       // return salary/AVERAGE_DAYS*days;
    }
}
