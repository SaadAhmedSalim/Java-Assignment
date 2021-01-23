
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		try {
			t.m(11);
			System.out.println("E");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
