/**
 * 
 */
package part_10;

/**
 * @author saad
 *
 */
public class ExtensionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendedShow ext = new ExtendedShow();
		SuperShow sup = ext;
		
		sup.show();
		ext.show();
		
		System.out.println("sup.str: "+ sup.str);
		System.out.println("sub.str: "+ ext.str);

	}

}
