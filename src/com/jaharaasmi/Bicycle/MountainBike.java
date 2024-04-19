package com.jaharaasmi.Bicycle;

public class MountainBike extends Bicycle
{
	int seatHeight;

	public MountainBike(int gears, int speed, int seatHeight) {
		
		// TODO Auto-generated constructor stub


	super(gears, speed);
	}
	


	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gears=" + gears + ", speed=" + speed + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
