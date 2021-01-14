/**
 * 
 */
package part_9;

/**
 * @author saad
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		
		t1 = t2;
		t1.showme();
		
		t1 = t3;
		t1.showme();
		
		t2 = t3;
		t2.showme();

	}

}
