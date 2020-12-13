
public class ComplexClass {
	private double realNumber;
	private double imaginaryNumber;
	
	public ComplexClass(double real, double imaginary){
		realNumber = real;
		imaginaryNumber = imaginary;
		System.out.println("It has two parameters");
	}
	
	public ComplexClass() {
		System.out.println("It is default Complex Class Object created");
	}
	
	void setRealPart(double realNumber) {
		this.realNumber = realNumber;
	}
	
	double getRealPart() {
		return realNumber;
	}
	
	void addToComplex(ComplexClass c) {
		this.realNumber = this.realNumber+this.realNumber;
		this.imaginaryNumber = this.imaginaryNumber+this.imaginaryNumber;
		System.out.println("Adding Complex number in here.");
	}
	
	ComplexClass multiply(ComplexClass c1, ComplexClass c2) {
		double a = c1.realNumber;
		double b = c1.imaginaryNumber;
		double x = c2.realNumber;
		double y = c2.imaginaryNumber;
		double new_real = a*x - b*y;
		double new_imag = a*y + b*x;
		
		ComplexClass temp = new ComplexClass(new_real, new_imag);
		return temp;
	}
	
	public String toString() {
		return ("Real Number: "+realNumber+", Imaginary Number: "+imaginaryNumber+"i");
	}

}
