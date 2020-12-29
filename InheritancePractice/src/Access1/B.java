/**
 * 
 */
package Access1;

/**
 * @author saad
 *
 */
public class B {
		
	void test() {
//		can't have access all types of fields in the same package
//		i=3;
//		j=4;
//		k=5;
//		l=1;
		
		A al=new A(); // can create object 
//		al.i = 1; // can't do  it.. coz it private
		al.j = 2;
		al.k = 3;
		al.l = 4;
	
	}

}
