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

public class Cessna extends Airplane{
	private int modelYear;
	
	public Cessna(String name, int modelYear) {
		super(name);
		// Uses super constructor
		this.setModelYear(modelYear);
	}
	
	@Override
	public Double calculateTakeOffDistance() {
		// return generic value just to prove inheritance
		return 1500.00;
	}
	
	/**
	 * 
	 * Make modelyear property read-only for public
	 */
	public int getModelYear() {
		return modelYear;
	}

	private void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

}
