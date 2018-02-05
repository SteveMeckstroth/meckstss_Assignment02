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

public abstract class Aircraft {
	private String name;
	
	public Aircraft(String name) {
		// Constructor for all Aircraft
		this.setName(name);
	}
	
	/**
	 * 
	 * The name is set in the contructor, but can be viewed read-only as a property
	 */
	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public abstract Double calculateTakeOffDistance();
}
