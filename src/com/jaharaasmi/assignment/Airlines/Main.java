package com.jaharaasmi.assignment.Airlines;
import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice=scanner.nextInt();
		System.out.println("Enter the hours of travel:");
		int hours=scanner.nextInt();
		System.out.println("Enter the cost per hour:");
		double costPerHour=scanner.nextDouble();
		
	
		double totalAmount;
		switch(choice)
		{
		case 1:
			AirIndia airIndia=new AirIndia(hours,costPerHour);
			totalAmount=airIndia.calculateAmount();
			airIndia.display(totalAmount);
			break;
		case 2:
			KingFisher kingfisher=new KingFisher(hours,costPerHour);
			totalAmount=kingfisher.calculateAmount();
			kingfisher.display(totalAmount);
			break;
		case 3:
			Indigo indigo=new Indigo(hours,costPerHour);
			totalAmount=indigo.calculateAmount();
			indigo.display(totalAmount);
			break;
		default:
			System.out.println("Invalid choice!");
			
		}
		scanner.close();
		}
		
	}
	
	
