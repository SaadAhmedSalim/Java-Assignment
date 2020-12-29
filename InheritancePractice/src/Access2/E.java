/**
 * 
 */
package Access2;
import Access1.A;
/**
 * @author saad
 *
 */
public class E extends A {
	void test() {
//		i=3; // private
		j=4; // directly access as extends use
//		k=5; // different package; default won't work
		l=1;
		
		A al=new A(); // can create object
//		al.i = 1; // private
//		al.j = 2; // protected won't work because it is object
//		al.k = 3;
		al.l = 4;
	
	}

}
