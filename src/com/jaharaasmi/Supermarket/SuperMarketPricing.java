package com.jaharaasmi.Supermarket;
import java.util.Scanner;

public class SuperMarketPricing 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of the item(N):");
		int N=sc.nextInt();
		
		int price=calculatePrice(N);
		System.out.println("Price of the item:"+price);
		sc.close();
	}
	private static int calculatePrice(int N)
	{
		int product=1;
		String strN=String.valueOf(N);
		for(int i=0;i<strN.length();i++)
		{
			int digit=Character.getNumericValue(strN.charAt(i));
			product*=digit;
		}
		return product;
	}
}

