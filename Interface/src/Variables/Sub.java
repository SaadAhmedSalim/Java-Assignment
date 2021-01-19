/**
 * 
 */
package Variables;

import java.util.Random;

/**
 * @author saad
 *
 */
public class Sub implements Parent {
	Random rand = new Random();
	int ask(){
		int p = (int) (100*rand.nextDouble());
		if(p<50) return NO;
		else return YES;
	}

}
