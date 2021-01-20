/**
 * 
 */
package caughtException;

/**
 * @author saad
 *
 */
public class ExceptionCaught {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c=0;
		try {
			c = a/b;
		} catch(ArithmeticException e1) {
			System.out.println("Catching....");
			System.out.println(e1);
//			System.out.println(c);
//			return;
		} finally {
			System.out.println("Finally....");
			System.out.println(c);
		}
	}

}
