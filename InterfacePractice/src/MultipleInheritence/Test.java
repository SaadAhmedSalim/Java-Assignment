package MultipleInheritence;

public class Test implements Beta{
	int p;
	void Test() {
		System.out.println("This is Test.");
	}
	void reset(int p) {
		this.p = p;
		System.out.println("This is Test "+ this.p);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.reset();
		t.reset(10);
	}

}
