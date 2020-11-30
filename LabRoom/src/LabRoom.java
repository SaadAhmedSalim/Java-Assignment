public class LabRoom {
	
	private int chair;
	private int table;
	private int computer;
	
	public LabRoom() {
		chair = 0;
		table = 0;
		computer = 0;
	}
	
	public LabRoom(int chair, int table, int computer) {
		setChair(chair);
		setTable(table);
		setComputer(computer);
	}
	
	public void setChair(int chair) {
		this.chair = chair;
	}
	public int getChair() {
		return chair;
	}
	
	public void setTable(int table) {
		this.table = table;
	}
	public int getTable() {
		return table;
	}
	
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public int getComputer() {
		return computer;
	}
	
	public String toString() {
		return String.format("Labroom has %d chairs, %d tables and %d computers.", getChair(), getTable(), getComputer());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabRoom labroom1 = new LabRoom(20,20,20);   // create object of LabRoom
		LabRoom labroom2 = new LabRoom(20,18,15);	// create object of LabRoom
		
		System.out.println(labroom1);
		System.out.println(labroom2);

	}

}
