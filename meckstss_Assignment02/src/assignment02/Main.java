/**
 * Assignment 02
 * @author Stephen Meckstroth
 * Description: A program to display the hierarchy of Aircraft using inheritance
 * Due Date: Jan 23, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */
package assignment02;

public class Main {

	public static void main(String[] args) {
		//Demonstrate inheritance
		
		//Helicraft
		Helicraft myHelicraft = new Helicraft("myAircraft");
		myHelicraft.setMilitary(false);
		System.out.println("myHelicraft takeoff distance: " + myHelicraft.calculateTakeOffDistance());
		
		//Gyrocopter
		Gyrocopter myGyrocopter = new Gyrocopter("I'm a gyrocopter");
		myGyrocopter.setHorsepower(1200);
		myGyrocopter.setMilitary(true);
		System.out.println("myGyrocopter takeoff distance: " + myGyrocopter.calculateTakeOffDistance());

		//Helicopter
		Helicopter myHelicopter = new Helicopter("I'm a helicopter");
		myHelicopter.setCallsign("Maverick");
		myHelicopter.setMilitary(true);
		System.out.println(myHelicopter.getCallsign() + " takeoff distance: " + myHelicopter.calculateTakeOffDistance());
		
		//Drone
		Drone myDrone = new Drone("My Drone");
		System.out.println(myDrone.getName() + " takeoff distance: " + myDrone.calculateTakeOffDistance());
		
		//Cessna
		Cessna myCessna = new Cessna("I'm a Cessna", 2017);
		System.out.println(myCessna.getModelYear() + " "+ myCessna.getName() + " takeoff distance: " + myCessna.calculateTakeOffDistance());
		
		//LeerJet
		LeerJet myLeerJet = new LeerJet("My Jet");
		System.out.println(myLeerJet.getName() + " takeoff distance: " + myLeerJet.calculateTakeOffDistance());
	}

}
