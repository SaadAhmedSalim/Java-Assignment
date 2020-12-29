/**
 * 
 */
package Access1;

/**
 * @author saad
 *
 */
public class C extends A{
	void test() {
//		i=3; // still can't have access as it is private field
		j=4; 
		k=5;
		l=1;
		
		A al=new A(); // can create object
//		al.i = 1;   // can't have access because it is private member
		al.j = 2;
		al.k = 3;
		al.l = 4;
	
	}


}
