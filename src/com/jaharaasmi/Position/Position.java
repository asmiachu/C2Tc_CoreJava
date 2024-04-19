package com.jaharaasmi.Position;
import java.util.Scanner;
public class Position {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of turns:");
		int n=scanner.nextInt();
		int[]position=calculateFinalPosition(n);
		System.out.println("Final Position:"+position[0]+" "+position[1]);
		scanner.close();
	}
	public static int[]calculateFinalPosition(int n)
	{
		int[]position=new int[2];
		int direction=1;
		int distance=10;
		for(int i=1;i<=n;i++)
		{
			if(direction==1) {
				position[0]+=distance;
			}
			else if(direction==2)
			{
				position[1]+=distance;
			}
			else if(direction==3)
			{
				position[0]-=distance;
			}
			else if(direction==4)
			{
				position[1]-=distance;
			}
			direction=(direction%4)+1;
			distance+=10;
		}
		return position;
	}
}

