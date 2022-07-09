package com.example.homework_2_10.service;

import com.example.homework_2_10.data.Employee;
import com.example.homework_2_10.exception.EmployeeAlreadyAddedException;
import com.example.homework_2_10.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    private final StringUtilsServiceImpl stringUtilsService;

    public EmployeeServiceImpl(StringUtilsServiceImpl stringUtilsService) {
        this.stringUtilsService = stringUtilsService;
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName, int departmentId, int salary) {
        Employee employee = new Employee(firstName, lastName);
        stringUtilsService.examinationLastname(lastName);
        stringUtilsService.examinationFirstname(firstName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName());
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> find() {
        return employees.values();
    }
}