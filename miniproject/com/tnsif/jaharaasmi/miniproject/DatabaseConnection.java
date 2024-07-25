package com.tnsif.jaharaasmi.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{
    private static final String URL = "jdbc:mysql://localhost:3306/companydb";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // replace with your MySQL password

    public static Connection getConnection() throws SQLException 
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}