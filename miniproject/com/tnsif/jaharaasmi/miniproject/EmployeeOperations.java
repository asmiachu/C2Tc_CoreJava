package com.tnsif.jaharaasmi.miniproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeOperations
{
    public static void insertEmployee(Connection connection, String emp_name, String designation, double salary, String location) throws SQLException 
    {
        String sql = "INSERT INTO employee (emp_name, designation, salary, location) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql))
        {
            pstmt.setString(1, emp_name);
            pstmt.setString(2, designation);
            pstmt.setDouble(3, salary);
            pstmt.setString(4, location);
            pstmt.executeUpdate();
            System.out.println("Employee inserted: " + emp_name);
        }
    }

    public static void showEmployees(Connection connection) throws SQLException 
    {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) 
        {
            System.out.println("Employees:");
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String designation = rs.getString("designation");
                double salary = rs.getDouble("salary");
                String location = rs.getString("location");
                System.out.println("ID: " + emp_id + ", Name: " + emp_name + ", Designation: " + designation + ", Salary: " + salary + ", Location: " + location);
            }
        }
    }

    public static void updateEmployee(Connection connection, int emp_id, String emp_name, String designation, double salary, String location) throws SQLException 
    {
        String sql = "UPDATE employee SET emp_name = ?, designation = ?, salary = ?, location = ? WHERE emp_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) 
        {
            pstmt.setString(1, emp_name);
            pstmt.setString(2, designation);
            pstmt.setDouble(3, salary);
            pstmt.setString(4, location);
            pstmt.setInt(5, emp_id);
            pstmt.executeUpdate();
            System.out.println("Employee updated: " + emp_name);
        }
    }

    public static void deleteEmployee(Connection connection, int emp_id) throws SQLException 
    {
        String sql = "DELETE FROM employee WHERE emp_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) 
        {
            pstmt.setInt(1, emp_id);
            pstmt.executeUpdate();
            System.out.println("Employee deleted with ID: " + emp_id);
        }
    }
}
