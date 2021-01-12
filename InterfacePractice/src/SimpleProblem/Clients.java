/**
 * 
 */
package SimpleProblem;

/**
 * @author saad
 *
 */
public class Clients implements Callback {
	public void call(int p) {
		System.out.println("Call with method "+p);
	}
	public void f() {
		System.out.println("This is in client, not interface");
	}

}
