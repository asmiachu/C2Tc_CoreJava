package com.jaharaasmi.assignment.Airlines;

import java.text.DecimalFormat;

public class AirIndia implements Airfare{
	private int hours;
	private double costPerHour;
	public AirIndia()
	{
	}
	
	public AirIndia (int hours,double costPerHour)
	{
		this.hours=hours;
		this.costPerHour=costPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	public double calculateAmount() {
		// TODO Auto-generated method stub
		return hours*costPerHour;
	}
	public void display(double amount)
	{
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println(df.format(amount));
	}


}


