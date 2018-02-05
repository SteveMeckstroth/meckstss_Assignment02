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

/**
 * 
 * Note method calculateTakeOffDistance is overridden in super class of Helicraft
 *
 */
public class Gyrocopter extends Helicraft{
	private int horsepower;
	
	public Gyrocopter(String name) {
		super(name);
		// Uses super constructor
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

}
