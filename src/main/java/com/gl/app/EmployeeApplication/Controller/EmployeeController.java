package com.gl.app.EmployeeApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @GetMapping("/employee")
        public String getemployee(){
        System.out.println("PRinting Employee details");
            return "Employee Details";
        }
    }

