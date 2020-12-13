
public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexClass c1 = new ComplexClass();
		ComplexClass c2 = new ComplexClass(2,-3);
		ComplexClass c3 = new ComplexClass(4,-9);
		
		c2.addToComplex(c3);
		ComplexClass c4 = c2.multiply(c2, c3);
		
		
		System.out.println(c2);
		System.out.println(c4);
		
		// jodi substring use korte bole
		String s1 = "Testing Java Program";
		String s2 = s1.substring(8,15);
		System.out.println(s2);
		
		// jodi position ber korte bole
		int j = s1.indexOf("J");
		System.out.println("Position of J is "+j);
		
		// jodi last name ber korte chai
		String s3 = "Saad;Salim";
		int f = s3.indexOf(";");
		String s4 = s3.substring(f+1);
		System.out.println(s4);
		
		// jodi middle name ber korte bole
		
		String s5 = "Saad Ahmed Salim";
		int a = s5.indexOf(" ");
		int b = s5.lastIndexOf(" ");
		String s6 = s5.substring(a+1, b);
		System.out.println(s6);
		

	}

}
