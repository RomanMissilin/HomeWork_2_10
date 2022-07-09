package com.example.homework_2_10.controller;

import com.example.homework_2_10.data.Employee;
import com.example.homework_2_10.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(
            @RequestParam("findName") String findName,
            @RequestParam("lastNAme") String lastName,
            @RequestParam("departmenId") int departmentId,
            @RequestParam("salary") int salary
    ) {
        return employeeService.add(findName, lastName, departmentId, salary);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("findName") String findName,
                                   @RequestParam("lastName") String lastName) {
        return employeeService.remove(findName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("findName") String findName,
                                 @RequestParam("lastName") String lastName) {
        return employeeService.find(findName, lastName);
    }

    @GetMapping
    public Collection<Employee> find() {
        return employeeService.find();
    }
}