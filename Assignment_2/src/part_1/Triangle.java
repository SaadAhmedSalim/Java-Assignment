/**
 * 
 */
package part_1;

/**
 * @author saad
 *
 */
public class Triangle extends Shape {
	private double height;
	private double base;
	
	Triangle(double h, double b, String s){
		super(s);
		this.height = h;
		this.base = b;
//		type = "Triangle";
//		color = "Yellow";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
	}
	
//	void property() {
//		type = "Triangle";
//		color = "Yellow";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
//	}

	void area() {
		double area = (height * base) / 2;
		System.out.println(String.format("Traingle Area: %.2f ", area));
	}

}
