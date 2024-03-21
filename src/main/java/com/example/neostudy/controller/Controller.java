package com.example.neostudy.controller;

import com.example.neostudy.service.SalaryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final SalaryServiceImpl service;

    public Controller(SalaryServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/calculate/")
    public double getData (@RequestParam (name = "salary") double salary,
    @RequestParam (name = "days") int days){
        return service.getPayment(salary,days);
    }
}
