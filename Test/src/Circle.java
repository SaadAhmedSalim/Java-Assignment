
class Circle {
	private double radius;
	private double center_x;
	private double center_y;
	
	public Circle(double radius, double center_x, double center_y) {
		this.radius = radius;
		this.center_x = center_x;
		this.center_y = center_y;
	}
	
	
	public void area() {
		
		double radius = (1/((center_x*center_x)+(center_y*center_y)));
		System.out.println("Using Circle Method, Radius is "+radius);
		double area= 3.14*(radius*radius);
		System.out.println(area);
	}
	
	public void radius() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(2,4,4);
		c1.area();
		c1.radius();
		
	}
}
