package customExceptions;

public class Custom {
	static void compute(int a) throws MyException{
		if(a>=10) {
			throw new MyException(a);
		} else {
			System.out.println("Less than Expected!");
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			compute(10);
			compute(20);
		} catch(MyException e) {
			System.out.println(e);
		}

	}

}
