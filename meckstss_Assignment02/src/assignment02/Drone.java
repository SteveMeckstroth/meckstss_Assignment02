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

public class Drone extends Aircraft{
	private int numberOfPropellors;
	
	public Drone(String name) {
		super(name);
		// TODO Uses super constructor
	}

	@Override
	public Double calculateTakeOffDistance() {
		// Drones require no takeoff distance
		return 0.0;
	}

	public int getNumberOfPropellors() {
		return numberOfPropellors;
	}

	public void setNumberOfPropellors(int numberOfPropellors) {
		this.numberOfPropellors = numberOfPropellors;
	}

}
