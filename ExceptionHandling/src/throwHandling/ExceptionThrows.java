package throwHandling;

public class ExceptionThrows {
	public static void f() throws IllegalAccessException{
		System.out.println("Inside f()");
		throw new IllegalAccessException("f");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch(IllegalAccessException e) {
			System.out.println("Inside catch of main()");
			e.printStackTrace();
		}

	}

}
