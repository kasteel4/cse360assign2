/**
 * Author: Keenan Steele
 * Class ID: 70641
 * Assignment 2
 * 
 * Adds a few basic integer arthmetic functions, such
 * as getTotal, add, and subtract. Also contains a
 * toString method and a clear method for resetting
 * the private variable.
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Constructor for AddingMachine class. Does not
	 * accept or return any values, simply instantiates
	 * the object.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Getter method for the 'total' variable.
	 * 
	 * @return	the value of the 'total' variable
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the total variable.
	 * 
	 * @param value	integer to be added to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total variable.
	 * 
	 * @param value	integer to be subtracted from the total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Returns a string containing the history of the 
	 * total variable, including all operations
	 * performed since the object was instantiated.
	 * 
	 * @return	history of the AddingMachine object
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Clears history from toString method and resets
	 * value of total to zero.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
