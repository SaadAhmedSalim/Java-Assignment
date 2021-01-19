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
}
