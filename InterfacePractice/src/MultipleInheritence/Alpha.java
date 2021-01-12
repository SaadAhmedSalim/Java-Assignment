/**
 * 
 */
package MultipleInheritence;

/**
 * @author saad
 *
 */
public interface Alpha {
	default void reset() {
		System.out.println("Alpha Test.");
	}

}
