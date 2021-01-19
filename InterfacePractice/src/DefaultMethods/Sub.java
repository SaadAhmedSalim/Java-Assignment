/**
 * 
 */
package DefaultMethods;

/**
 * @author saad
 *
 */
public class Sub implements Default {
	public int getNumber() {
		return 10;
	}
//	I can't inherit default or static methods in SubClass
//	But I can override default by making it public.
//	public String getString() {
//		return "I am SubClass";
//	}
// I can make a static of this class but can't inherit from interface.
//	static int statics() {
//		return 2;
//	}
}
