package com.example.homework_2_10.service;

import com.example.homework_2_10.data.Employee;
import com.example.homework_2_10.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public abstract class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findPlayMinSalary(int departmentId) {
        return employeeService.find().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException:: new);
    }

    @Override
    public Employee findPlayMaxSalary(int departmentId) {
        return employeeService.find().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException :: new);
    }

    @Override
    public List<Employee> findAllDepartmentId(int departmentId) {
        return employeeService.find().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> findAllGroupedDepartment() {
        return employeeService.find().stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentId));
    }
}