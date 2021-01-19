/**
 * 
 */
package DefaultMethods;

/**
 * @author saad
 *
 */
public interface Default {
	int getNumber();
	default String getString() {
		return "This is default from Interface.";
	}
	
	static int statics() {
		return 9;
	}
	public static void main(String[]args) {
		System.out.println(Default.statics());
//		only can do static call in here.
	}
}
