package com.jaharaasmi.Bicycle;

import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		{
			System.out.println("Enter number of gears,speed,and seat height:");
			int gears=scanner.nextInt();
			int speed=scanner.nextInt();
			int seatHeight=scanner.nextInt();
			scanner.close();
			
			MountainBike bike=new MountainBike(gears,speed,seatHeight);
            System.out.println("Bike"+bike);
            System.out.println("No of Gears:"+gears);
            System.out.println("Speed of the bicycle is:"+speed);
            System.out.println("Seat Height is:"+seatHeight);
		}
	}
}