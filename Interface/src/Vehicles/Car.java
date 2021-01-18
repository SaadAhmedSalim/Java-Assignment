/**
 * 
 */
package Vehicles;
import interfacetest.Drivable;
/**
 * @author saad
 *
 */
public class Car extends Vehicle implements Drivable{
	double engine_cc = 1.5;
	Car(){
		System.out.println("This is Child Class of Car.");
	}
	void show(double engine_cc) {
		System.out.println(engine_cc+" ");
		System.out.println(this.engine_cc+ " ");
		System.out.println(super.engine_cc+ " ");
	}
	public void applyGear() {
		System.out.println("Gear Print.");		
	}
	public void startEngine() {
		System.out.println("Engine Print.");
	}
}
