package Access2;
import Access1.A;

public class D {
	void test() {
//		i=3;
//		j=4; // different package; can't access
//		k=5;
//		l=1;
		
		A al=new A(); // can create object
//		al.i = 1; // private
//		al.j = 2; // protected
//		al.k = 3; // default
		al.l = 4;
	
	}

}
