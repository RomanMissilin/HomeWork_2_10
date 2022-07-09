package com.example.homework_2_10.service;

import com.example.homework_2_10.data.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findPlayMinSalary(int departmentId);
    Employee findPlayMaxSalary(int departmentId);
    List<Employee> findAllDepartmentId(int departmentId);
    Map<Integer, List<Employee>> findAllGroupedDepartment();
}
