package com.jaharaasmi.Supermarket;
import java.util.Scanner;

public class CarpetInstallation 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of cuts(N):");
		int N=scanner.nextInt();
		
		int maxSquares=(N+1)*(N+1);
		System.out.println("Maximum Number of Equal Squares or Rectangles:"+maxSquares);
		scanner.close();
	}
}

		
	