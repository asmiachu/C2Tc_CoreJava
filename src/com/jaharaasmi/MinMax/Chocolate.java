
package com.jaharaasmi.MinMax;
import java.util.Scanner;

public class Chocolate {

		public static void main(String args[])
		{
			Scanner scr=new Scanner(System.in);
			
			System.out.println("Enter the number of rows in the chocolate:");
			int n=scr.nextInt();
			
			System.out.println("Enter the number of columns in the chocolate:");
			int m=scr.nextInt();
			
			if (n%2==0||m%2==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			scr.close();
			
			}
}



