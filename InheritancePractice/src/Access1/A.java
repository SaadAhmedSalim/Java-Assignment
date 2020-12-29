/**
 * 
 */
package Access1;

/**
 * @author saad
 *
 */
public class A {
	private int i;
	protected int j;
	int k;
	public int l;
	
	
	void test() {
//		can have access all types of fields in the same class
		i=3;
		j=4; // directly access
		k=5;
		l=1;
		
		A al=new A(); // can create object
		al.i = 1;
		al.j = 2;
		al.k = 3;
		al.l = 4;
	
	}

}
