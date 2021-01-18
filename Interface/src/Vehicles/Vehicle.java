/**
 * 
 */
package Vehicles;

/**
 * @author saad
 *
 */
public abstract class Vehicle {
	double engine_cc = 8.5;
	
	Vehicle(){
		System.out.println("This is an Abstract Class of Vehicle.");
	}
	abstract void show(double engine_cc);
}
