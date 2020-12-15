/**
 * 
 */

/**
 * @author saad
 *
 */
import java.lang.Math;

public class Circle {
	private double radius;
	private double center_x;
	private double center_y;
	
	public Circle(){
		System.out.println("This Circle has no parameters.");
	}
	
	public Circle(double center_x, double center_y) {
		this.center_x = center_x;
		this.center_y = center_y;
	}
	void circleArea() {
		double center_x = this.center_x * this.center_x;
		double center_y = this.center_y * this.center_y;
		double add = center_x + center_y;
		double radius = Math.sqrt(add);
		System.out.println("Radius is : "+radius);
		this.radius = radius * radius;
		double area = 3.14 * this.radius;
		System.out.println("Total Area is : "+area);
	}
	
	void print() {
		System.out.println("Circle coordinate point ("+center_x+" ,"+center_y+")");
	}

}
