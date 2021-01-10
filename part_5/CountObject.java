/**
 * 
 */
package part_5;

/**
 * @author saad
 *
 */
public class CountObject {
	static int numberOfObject = 0;
//	{
//		numberOfObject+=1;
//	}
	public CountObject() {
		numberOfObject+=1;
	}
	public CountObject(int a) {
		numberOfObject+=1;
	}
	public CountObject(String s) {
		numberOfObject+=1;
	}
	
	int number_of_object() {
		return numberOfObject;
	}

}
