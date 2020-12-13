
public class Tes {
	int i;
	int j;
	double r;
	int color;
	
	Tes(double rr, int c){
		r = rr;
		color = c;
	}
	boolean equal(Tes c) {
		if((this.r==c.r) && (this.color==c.color)) return true;
		else
			return false;
	}
	void makeDouble(double rad) {
		rad = rad * 2;
	}
	void makeDouble(Tes c) {
		c.r = c.r * 2;
	}

	Tes(){
		i = 10;
		j = 20;
	}
	int add() {
		return (i+j);
	}
}