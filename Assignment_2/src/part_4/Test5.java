/**
 * 
 */
package part_4;

/**
 * @author saad
 *
 */
public class Test5 extends Test4 {
	private int j;
	/**
	 * 
	 */
	Test5(){
		super(1);
		j = 1;
	}
//	Test5(int k) {
//		super(k);
//		System.out.println("Test 5");
//		// TODO Auto-generated constructor stub
//	}
	Test5(int a, int b){
		super(a);
		j = b;
	}
	public void printVal() {
		System.out.println(i);
	}
	public void printSum(){
		System.out.println(i+j);
	}


}
