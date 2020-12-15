public class Overloading {
	public Overloading() {
		System.out.println("This Constructor has No Parameter.");
	}	
	public Overloading(int a, int b) {
		System.out.println("Both are Integer");
	}
	public Overloading(int a, double d) {
		System.out.println("1st one Integer, 2nd one Double");
	}
	public Overloading(float f, int b) {
		System.out.println("1st one Float, 2nd one Integer");
	}
	public Overloading(float f, double d) {
		System.out.println("1st one Float, 2nd one Double");
	}
	/**
	 * @author saad
	 *
	public Overloading(float a, float b) {
		System.out.println("Both are Float");
	}
	public Overloading(double a, int b) {
		System.out.println("1st one Double, 2nd one Integer");
	}
	 *
	 */

	
	public Overloading(double a, double b) {
		System.out.println("Both are Double");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ov1 = new Overloading();
		Overloading ov2 = new Overloading(1,1);
		Overloading ov3 = new Overloading(2.5,1);
		Overloading ov4 = new Overloading(1.5,1.5);
		Overloading ov5 = new Overloading(1.5f,1);
		Overloading ov6 = new Overloading(1.5f,1.5f);
		
		

	}

}
