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
    public Employees createEmployees(@RequestBody Employees employees){
        employeesReposivetory.save(employees);
        return employees;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Employees> findAllEmployees(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit
    ) {
        return employeesReposivetory.findAll();
    }
}
