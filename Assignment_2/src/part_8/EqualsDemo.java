/**
 * 
 */
package part_8;

/**
 * @author saad
 *
 */
public class EqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals e1 = new Equals();
		Equals e2 = new Equals();
		Equals e4 = new Equals();
		
		e1.i = 10;
		e2.i = 20;
		e4.i = 10;
		
		Equals e3 = e2;
		
		Equals2 e6 = new Equals2();
		Equals2 e7 = new Equals2();
		
		e6.i = 30; e7.i = 30;
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e6.equals(e7));

	}

}
