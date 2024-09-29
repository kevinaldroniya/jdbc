package org.example.repository;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    void batchInsert(List<Employee> employees);
}
