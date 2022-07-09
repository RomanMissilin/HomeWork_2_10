package com.example.homework_2_10.data;

import java.util.Objects;

public class Employee {

    private final String firsName;
    private final String lassName;
    private int salary;
    private int departmentId;

    public Employee(String firsName, String lassName) {
        this.firsName = firsName;
        this.lassName = lassName;
    }

    public String getFullName() {
        return firsName + " " + lassName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLassName() {
        return lassName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firsName, employee.firsName)
                && Objects.equals(lassName, employee.lassName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lassName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firsName='" + firsName + '\'' +
                ", lassName='" + lassName + '\'' +
                ", salary=" + salary +
                ", department=" + departmentId +
                '}';
    }
}