/**
 * 
 */
package throwHandling;

/**
 * @author saad
 *
 */
public class ThrowException {

	/**
	 * @param args
	 */
	public static void f() {
		try {
			throw new NullPointerException("f");
		} catch(NullPointerException e) {
			System.out.println("Inside catch of f()");
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();			
		} catch(NullPointerException e) {
			System.out.println("Inside catch of Main()");
		}
	}

}
