public class Box {
	
	private double height;
	private double width;
	private double depth;
	
	public Box() {
		this.height = 0;
		this.width = 0;
		this.depth = 0;
	}
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	void volume(Box b1) {
		double a = b1.height;
		double b = b1.width;
		double c = b1.depth;
		double volume = a * b * c;
		//Box temp = new Box(a,b,c);
		//return temp;
		System.out.println(String.format("Box Object volume is: %.2f", volume));
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidht(double width) {
		this.width = width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	public double getDepth(){
		return depth;
	}
	public void getVolume() {
		double volume = height * width * depth;
		System.out.println(String.format("Box Volume is : %.2f", volume));
	}
	
	public String toString() {
		return String.format("height is "+ getHeight() + " width is "+ getWidth() + " and depth is " +getDepth() +".");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(10.323, 21.32, 9);
		Box box2 = new Box();
		
		box2.setHeight(12.5);
		box2.setWidht(10.4);
		box2.setDepth(4);
		
		System.out.println("Box 1 "+box1);
		System.out.println("Box 2 "+box2);
		
		box1.getVolume();
		box2.getVolume();
		
		Box box3 = new Box();
		box3.volume(box2);
		
	}
}
