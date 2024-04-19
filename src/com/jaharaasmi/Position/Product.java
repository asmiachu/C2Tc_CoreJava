package com.jaharaasmi.Position;
import java.util.Scanner;

	public class Product {
		public static void main(String args[])
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the code of the item:");
			int code=scanner.nextInt();
			int product=getProductsOfDigits(code);
			System.out.println("Price of the item:"+product);
			scanner.close();
		}
		public static int getProductsOfDigits(int num)
		{
			int product=1;
			while(num!=0)
			{
				int digit=num%10;
				product*=digit;
				num/=10;
			}
			return product;
		}
	}


