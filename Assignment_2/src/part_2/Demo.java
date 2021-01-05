/**
 * 
 */
package part_2;

/**
 * @author saad
 *
 */
public class Demo extends Overidding{

	/**
	 * @param args
	 */
	int y;
	Demo(int a, int b){
		super(a);
		this.y = b;
	}
	void display(){
		System.out.println("Sub Class");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overidding obj = new Demo(1,2);

		obj.display();
	}

}
