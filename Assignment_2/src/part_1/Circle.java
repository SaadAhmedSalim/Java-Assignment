/**
 * 
 */
package part_1;

/**
 * @author saad
 *
 */
public class Circle extends Shape{
	private double radius;
	
	Circle(double r, String s){
		super(s);
		this.radius = r;
//		type = "Circle";
//		color = "Blue";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
	}
	
//	void property() {
//		type = "Circle";
//		color = "Blue";
//		System.out.println("Shape Type is: "+type+" and Color is: "+color);
//	}
		
	void area(){
		double area = 3.14 * (radius * radius); 
		System.out.println(String.format("Circle Area: %.2f ", area));		
	}
	public static void main(String[] args) {
		Shape c = new Circle(1,"Circle");
		
		c.area();
	}

}
