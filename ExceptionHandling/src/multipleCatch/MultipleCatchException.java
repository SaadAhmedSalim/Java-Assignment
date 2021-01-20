/**
 * 
 */
package multipleCatch;

/**
 * @author saad
 *
 */
public class MultipleCatchException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c = 0;
		try {
			c = a/b;
		} catch(ArithmeticException e1) {
			System.out.println("Arithmetic Exception Calling..");
			System.out.println(e1);
		} catch(NullPointerException e2) {
			System.out.println("Null Pointer Exception Calling..");
			System.out.println(e2);
		} catch(Exception e) {
			System.out.println("Exception Calling..");			
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
