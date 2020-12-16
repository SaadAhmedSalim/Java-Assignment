
public class Complex {
	private double realNumber;
	private double imaginaryNumber;
	
	public Complex(double real, double imaginary){
		this.realNumber = real;
		this.imaginaryNumber = imaginary;
		//System.out.println("It has two parameters");
	}
	
	public Complex() {
		System.out.println("It is default Complex Class Object created");
	}
	
	public static Complex addition(Complex c1, Complex c2) {
		Complex temp = new Complex(0,0);
		temp.realNumber = c1.realNumber + c2.realNumber;
		temp.imaginaryNumber = c1.imaginaryNumber + c2.imaginaryNumber;
//		double a = c1.realNumber;
//		double b = c1.imaginaryNumber;
//		double x = c2.realNumber;
//		double y = c2.imaginaryNumber;
//		double new_real = a+x;
//		double new_imag = b+y;
		
		//Complex temp = new Complex(new_real, new_imag);
		return temp;
	}
	public String toString() {
		return ("Real Number: "+realNumber+", Imaginary Number: "+imaginaryNumber+"i");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c = new Complex(2,-2);
		Complex c1 = new Complex(1,-1);
		Complex sum = addition(c,c1);
		System.out.println("Sum is: "+ sum.realNumber+" , "+ sum.imaginaryNumber +"i");
		

	}

}
