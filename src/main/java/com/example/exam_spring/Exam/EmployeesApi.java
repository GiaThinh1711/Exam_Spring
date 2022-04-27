package com.example.exam_spring.Exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesApi {
    @Autowired
    EmployeesReposivetory employeesReposivetory;

    @PostMapping
    public Employees save(@RequestBody Employees employees){
        employeesReposivetory.save(employees);
        return employees;
    }

}
