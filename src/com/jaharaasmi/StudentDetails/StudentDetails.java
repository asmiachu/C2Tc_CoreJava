package com.jaharaasmi.StudentDetails;
import java.util.Scanner;

	public class StudentDetails 
	{
		public static void main(String[]args)
		{
			Scanner scr=new Scanner(System.in);
			String fullName;
			char initial;
			char grade;
			long rollnumber;
			float percentage;
			
			System.out.println("Enter Your FullName:");
			fullName=scr.nextLine();
			
			System.out.println("Enter Your Initial:");
			initial=scr.next().charAt(0);
			
			System.out.println("Enter your Roll Number:");
			rollnumber=scr.nextInt();
			
			System.out.println("Enter your Grade:");
			grade=scr.next().charAt(0);
			
			System.out.println("Enter Your percentage:");
			percentage=scr.nextFloat();
			
			System.out.println("FullName:"+fullName+""+initial);
			System.out.println("RollNumber:"+rollnumber);
			System.out.println("Grade:"+grade);
			System.out.println("Percentage:"+percentage+"%");
			scr.close();
			
		}
		
	}

