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

public class Airplane extends Aircraft{

	public Airplane(String name) {
		super(name);
		// Uses super constructor
	}

	@Override
	public Double calculateTakeOffDistance() {
		// return generic value just to prove inheritance and the override by child classes
		return 999.99;
	}

}
