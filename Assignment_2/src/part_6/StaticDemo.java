/**
 * 
 */
package part_6;

/**
 * @author saad
 *
 */
public class StaticDemo {
	int num1 = 6;
	static int num2 = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		
		s1.num1 = 15;
		s1.num2 = 17;
		s2.num1 = 22;
		s2.num2 = 28;
		System.out.println(s1.num1+" "+s1.num2+" "+s2.num1+" "+s2.num2);

	}

}
