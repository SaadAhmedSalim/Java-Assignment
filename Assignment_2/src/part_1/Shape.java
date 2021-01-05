/**
 * 
 */
package part_1;

/**
 * @author saad
 *
 */
public abstract class Shape {
//	String type;
//	String color;
	String shapeName;
	Shape(String s){
		this.shapeName = s;
		System.out.println("Shape Name: "+this.shapeName);
	}
    abstract void area();
}
