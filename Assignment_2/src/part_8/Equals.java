/**
 * 
 */
package part_8;

/**
 * @author saad
 *
 */
public class Equals {
	int i;
	
	public boolean equals(Object o) {
		System.out.println("Overridden");
		Equals e = (Equals)o;
		if(this.i == e.i) {
			return true;
		}else {
			return false;
		}
	}

}
