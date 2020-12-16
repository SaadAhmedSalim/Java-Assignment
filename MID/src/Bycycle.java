
public class Bycycle {
	private double weight;
	private double speed_per_gear;
	private double gear_no;
	
	public Bycycle() {
		System.out.println("No Parameter");
	}
	
	public Bycycle(double weight, double speed_per_gear, double gear_no) {
		this.weight = weight;
		this.speed_per_gear = speed_per_gear;
		this.gear_no = gear_no;
	}
	public double maximumSpeed() {
		double s = 0.4 * weight * speed_per_gear * gear_no;
		return s;
	}
	public String method(Bycycle b1) {
		double my_max = this.maximumSpeed();
		double b1_max = b1.maximumSpeed();
		if (my_max < b1_max) {
			return String.format("The %.2f bycycle is slower",my_max);
		}else if(my_max == b1_max) {
			return "Same Speed";
		}
		else {
		return "The bycycle is faster";
		}
	}
	public void print() {
		System.out.println("Weight :"+weight+ " Speed per gear "+speed_per_gear+", Gear no: "+gear_no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bycycle b1 = new Bycycle(36,323,4);
		Bycycle b2 = new Bycycle(36,323,5);
		System.out.println(b1.maximumSpeed()); 
		System.out.println(b2.maximumSpeed()); 
		System.out.println(b1.method(b2)); 

	}

}
