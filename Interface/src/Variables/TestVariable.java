package Variables;

public class TestVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		System.out.println("Random Number Generator: "
				+ "If it is less than 50 return 0(False) and "
				+ "if it is not return 1(True).");
		for(int i=0; i<2; i++) {
			System.out.println("Randomly Number is : "+s.ask());
		}

	}

}
