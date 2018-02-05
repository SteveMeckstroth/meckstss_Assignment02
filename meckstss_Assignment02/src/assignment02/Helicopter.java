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
 * Note calculateTakeOffDistance is overriden in super
 *
 */
public class Helicopter extends Helicraft{
	private String callsign;
	
	public Helicopter(String name) {
		super(name);
		// Uses super constructor
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

}
