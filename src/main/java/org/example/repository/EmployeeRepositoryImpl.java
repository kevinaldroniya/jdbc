package org.example.repository;

import org.example.ConnectionUtil;
import org.example.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Override
    public void batchInsert(List<Employee> employees) {
        /*
            * The try-with-resources statement is used to declare and instantiate resources that will be automatically closed.
         */
        try(Connection connection = ConnectionUtil.getDataSource().getConnection()){
            /*
                * The SQL query to insert the employee data into the employee table.
                * The email and name columns are inserted with the values from the Employee object.
             */
            String sql = "INSERT INTO employee (email, name) VALUES (?, ?)";
            /*
                * The PreparedStatement object is created with the SQL query
             */
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                for (Employee employee : employees){
                    // The email and name values are set to the PreparedStatement object
                    preparedStatement.setString(1, employee.getEmail());
                    preparedStatement.setString(2, employee.getName());
                    // The batch is added
                    preparedStatement.addBatch();
                }
                // The batch is executed
                int[] ints = preparedStatement.executeBatch();
                // The number of rows inserted is printed
                System.out.println("Number of rows inserted: " + ints.length);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
