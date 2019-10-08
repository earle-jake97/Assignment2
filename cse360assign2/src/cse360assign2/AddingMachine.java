/*	Name: Jake Earle
 *	Class ID: CSE 360 85141
 *	Assignment 2
*/

package cse360assign2;

/**
 * This class is responsible for handling the methods for the Activity Object. An Activity can be defined as a Node on our Activity Diagram that we are performing analysis on
 * @author Jake Earle
 * @version 1.0
 *
 */

/**
 * This is the class responsible for handling methods for a AddingMachine object. The AddingMachine is responsible for various methods which can perform arithmetic operations.
 * 
 * @author Jake Earle
 *
 */

public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = Integer.toString(total); // string used for keeping a history of operations for use in toString method
	}
	
	/**
	 * <p>The getTotal method is used to retrieve the value of the current total </p>
	 * @return the integer value of the current total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * <p>The add method is used to add the specified value to the total variable </p>
	 * @param value is an integer that will be added to the total variable
	 */
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + Integer.toString(value); // will add the + operation and value for the toString method
	}
	
	/**
	 * <p>The subtract method is used to subtract the specified value from the total variable </p>
	 * @param value is an integer that will be subtracted from the total variable
	 */	
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + Integer.toString(value); // will add the - operation and value for the toString method
	}
	
	/**
	 * <p>The toString method is used to create a history of all transactions </p>
	 * @return the string which contains all previous operations performed by the add and subtract methods
	 */		
	
	public String toString () {
		return history;
	}
	
	/**
	 * <p>The clear method is used to reset the balance and history </p>
	 */
	
	public void clear() {
		total = 0;
		history = Integer.toString(total);
	}
}
