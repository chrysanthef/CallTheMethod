// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class ArlineRegistration {
	ArlineRegistration(){
String firstName = JOptionPane.showInputDialog("Enter first name.");
String lastName = JOptionPane.showInputDialog("Enter last name.");
String destination = JOptionPane.showInputDialog("Enter destination name.");
String gender = JOptionPane.showInputDialog("Enter gender: M or F.");
String birthday = JOptionPane.showInputDialog("Enter birthday in format: MM/DD/YYYY.");

String boardingPassP1 = lastName.toUpperCase() + (" / ") + firstName.toUpperCase() + " (" + birthday.toUpperCase() + ", " + gender.toUpperCase() + ")" + 
"\nTraveling to: " + destination.toUpperCase();

JOptionPane.showMessageDialog(null, boardingPassP1);

}
	public static void main(String[] args) {
		new ArlineRegistration();
	}

}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plane) and print out the number of passengers after each boarding pass.
*/
