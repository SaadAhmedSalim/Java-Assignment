/**
 * 
 */
package part_1;

/**
 * @author saad
 *
 */
public class Geometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new Rectangle(2,2,"Rectangle");
		//r.property();
		r.area();

		Shape c = new Circle(1,"Circle");
		//c.property();
		c.area();
		
		Shape t = new Triangle(2,2,"Triangle");
		//t.property();
		t.area();
	}

}
