import java.math.*;
class Triangle {
	
	private double side1;
	private double side2;
	private double angle;
	
	public Triangle() {
		side1 = -1;
		side2 = -1;
		angle = 0;
	}
	
	public Triangle(double side1, double side2, double angle) {
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
	}
	public String toString() {
		return String.format("Side 1: "+ side1 + "\nSide 2: "+ side2 +"\nAngle : "+ angle);
	}
	
	public void getArea() {
		angle =(angle/180) * 3.14;
		//System.out.println(angle);
		double area = 0.5 * side1 * side2 * Math.sin(angle);
		System.out.println(String.format("Triangle Area: %.2f", area));
	}
	public void getArea(double b, double h) {
		this.side1 = b;
		this.side2 = h;
		double area = (b * h) / 2;
		System.out.println("Area is: "+area);
	}
}

class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(1,1,90);
		
		System.out.println(triangle);
		triangle.getArea();
		
		Triangle t1 = new Triangle();
		t1.getArea(2, 1);
		
	}
}

