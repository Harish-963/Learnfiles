package Inheritance;

class TestVehiclesHierarchy {
	public static void main(String arg[]) {
		MountainBike mb = new MountainBike();
		mb.numberOfWheels = 2;
		mb.registrationNumber = "APXX WWW";
		mb.hasHelmet = true;
		mb.maxElevation = 3000.0;

		System.out.print("Mountain Bike with registration Number " + mb.registrationNumber);
		System.out.println(" is supported till the elevation of " + mb.maxElevation + " feet.");
		
		
		Cycle c=new Cycle();
		c.hasBackSeat=false;
		c.numberOfWheels=2;
		 System.out.println(c.hasBackSeat +"\t"+ c.numberOfWheels);
	}
}

class Vehicle {
	int numberOfWheels;
}

class RegisteredVehicle extends Vehicle {
	String registrationNumber;
}

class Bike extends RegisteredVehicle // LINE A
{
	boolean hasHelmet;
}

class MountainBike extends Bike {
	double maxElevation;
}

class Car extends RegisteredVehicle {
	boolean hasAC;
}

class Cycle extends Vehicle {
	boolean hasBackSeat;
}
