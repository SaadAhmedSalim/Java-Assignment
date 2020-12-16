class MuliDemo{
	
	public static void main(String[] args) {
		
		int i=10;
		double f = 3.0;
		float d = 2.5f;
		MyMultiply m = new MyMultiply();
		
		m.multiply();
		m.multiply(i);
		m.multiply(i,i);
		m.multiply(d);
		m.multiply(f,d);
		m.multiply(d);
		
	}
	
	
}

class MyMultiply{
	void multiply() {
		System.out.println("NO Parameter");
	}
	void multiply(double x) {
		System.out.println("Double:"+x*x);
		
	}
	
	void multiply(int x) {
		System.out.println("int:"+x*x);
		
	}
	
	void multiply(float f1, float f2) {
		System.out.println("Float:"+f1*f2);
		
	}
	
	void multiply(double d1, double d2) {
		System.out.println("Square:"+d1*d2);
		
	}
}
