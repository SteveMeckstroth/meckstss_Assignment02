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

public class Helicraft extends Aircraft{
	private boolean military;
	
	public Helicraft(String name) {
		super(name);
		// Constructor inherited from super
	}

	@Override
	public Double calculateTakeOffDistance() {
		// All Helicraft require 0 takeoff distance
		return 0.0;
	}

	public boolean isMilitary() {
		return military;
	}

	public void setMilitary(boolean military) {
		this.military = military;
	}

}
