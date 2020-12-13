
public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tes c1 = new Tes();
		c1.r = 10;
		
		Tes c2 = new Tes();
		c2.r = 15;
		System.out.println(c2.r);
		
		c1.makeDouble(c2.r);
		System.out.println(c2.r);
		
		c1.makeDouble(c1);
		System.out.println(c1.r);
		
		Tes c3 = new Tes(10,14);
		Tes c4 = new Tes(10,14);
		
		System.out.println(c3.equal(c4));
		

	}

}
