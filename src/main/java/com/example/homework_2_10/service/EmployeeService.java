package com.example.homework_2_10.service;

import com.example.homework_2_10.data.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, int salary, int departmentId);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> find();
}