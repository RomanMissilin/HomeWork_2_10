package com.example.homework_2_10.controller;

import com.example.homework_2_10.data.Employee;
import com.example.homework_2_10.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/min-salary")
    public Employee findPlayMinSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findPlayMinSalary(departmentId);
    }

    @GetMapping("/max-salary")
    public Employee findPlayMaxSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findPlayMaxSalary(departmentId);
    }

    @GetMapping("/all")
    public List<Employee> findAllDepartmentId(@RequestParam("departmentId") int departmentId) {
        return departmentService.findAllDepartmentId(departmentId);
    }

    @GetMapping(value = "/all", params = "departmentId")
    public Map<Integer, List<Employee>> findAllGroupedDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.findAllGroupedDepartment();
    }
}