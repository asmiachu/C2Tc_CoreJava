package com.jaharaasmi.MinMax;
import java.util.Scanner;

public class ExConFair 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the count provided by the first guard:");
		int A=sc.nextInt();
		
		System.out.println("Enter the count provided by the second guard:");
		int B=sc.nextInt();
		
		int minEntries=Math.max(A, B);
		int maxEntries=A+B;
		
		System.out.println("Minimum number of Entries:"+minEntries);
		System.out.println("Maximum number of Entries:"+maxEntries);
		System.out.println(minEntries+" "+maxEntries);
		sc.close();
		
	}
}
