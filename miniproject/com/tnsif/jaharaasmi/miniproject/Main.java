package com.tnsif.jaharaasmi.miniproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		try (Connection connection = DatabaseConnection.getConnection()) 
		{
            System.out.println("Database connected!");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select an option:");
                System.out.println("1: Insert Employee");
                System.out.println("2: Show Employees");
                System.out.println("3: Update Employee");
                System.out.println("4: Delete Employee");
                System.out.println("5: Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) 
                {
                case 1:
                	System.out.print("Enter employee name: ");
                    String emp_name = scanner.nextLine();
                    System.out.print("Enter designation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();
                    EmployeeOperations.insertEmployee(connection, emp_name, designation, salary, location);
                    break;
                 case 2:
                	 EmployeeOperations.showEmployees(connection);
                     break;
                 case 3:
                	 System.out.print("Enter employee ID to update: ");
                     int updateId = scanner.nextInt();
                     scanner.nextLine(); // consume newline
                     System.out.print("Enter new employee name: ");
                     String newEmpName = scanner.nextLine();
                     System.out.print("Enter new designation: ");
                     String newDesignation = scanner.nextLine();
                     System.out.print("Enter new salary: ");
                     double newSalary = scanner.nextDouble();
                     scanner.nextLine(); // consume newline
                     System.out.print("Enter new location: ");
                     String newLocation = scanner.nextLine();
                     EmployeeOperations.updateEmployee(connection, updateId, newEmpName, newDesignation, newSalary, newLocation);
                     break;
                  case 4:
                     System.out.print("Enter employee ID to delete: ");
                     int deleteId = scanner.nextInt();
                     EmployeeOperations.deleteEmployee(connection, deleteId);
                     break;
                  case 5:
                     System.out.println("Exiting...");
                     scanner.close();
                     return;
                  default:
                     System.out.println("Invalid choice. Please try again.");
                }
            }
            
        } 
		catch (SQLException e)
		{
            e.printStackTrace();
        }
    }
}
