/**
 * 
 */
package part_1;

/**
 * @author saad
 *
 */
public class Rectangle extends Shape{
	private double length;
	private double width;
	
//	void property() {
//		type = "Rectangle";
//		color = "Red";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
//	}
	
	Rectangle(double l, double w, String s){
		super(s);
		this.length = l;
		this.width = w;
//		type = "Rectangle";
//		color = "Red";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
	}
	
	void area() {
		double area = length * width;
		System.out.println(String.format("Rectangle Area: %.2f ", area));
	}

}
