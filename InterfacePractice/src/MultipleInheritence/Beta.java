/**
 * 
 */
package MultipleInheritence;

/**
 * @author saad
 *
 */
public interface Beta extends Alpha {
	default void reset() {
		System.out.println("Beta Test.");
	}

}
