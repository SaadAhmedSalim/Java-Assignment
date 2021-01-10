/**
 * 
 */
package part_5;

/**
 * @author saad
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountObject obj1 = new CountObject();
		CountObject obj10 = new CountObject();
		CountObject obj = new CountObject();
		CountObject obj2 = new CountObject(3);
		CountObject obj3 = new CountObject("Saad");

		System.out.println("Total Objects created: "+obj.numberOfObject);
	}

}
