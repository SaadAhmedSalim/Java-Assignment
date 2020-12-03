
class Triangle {
	
	private double side1;
	private double side2;
	private double angle;
	
	public Triangle(double side1, double side2, double angle) {
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
	}
	public String toString() {
		return String.format("Side 1: "+ side1 + "\nSide 2: "+ side2 +"\nAngle : "+ angle);
	}
}

class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(1.1,1.1,90);
		
		System.out.println(triangle);
	}
}

