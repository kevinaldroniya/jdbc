package org.example;

import org.example.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.example.repository.EmployeeRepositoryImpl;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create an instance of the EmployeeRepository
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            employees.add(new Employee("employee" + i + "@example.com", "Employee " + i));
        }

        // Insert the list of employees into the employee table
        employeeRepository.batchInsert(employees);
    }
}