/**
 * 
 */
package uncaughtException;

/**
 * @author saad
 *
 */
public class ExceptionUncaught {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c = 0;
//		int c = a/b; // arithmetic exception
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		String s = null;
//		System.out.println(s.length()); // null pointer exception

		try {
			c = a/b;
						
		} catch(Exception e) {
			System.out.println(e);
//			return;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
