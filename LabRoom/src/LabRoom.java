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
	/*
	public String toString() {
		return String.format("Labroom has %d chairs, %d tables and %d computers.", getChair(), getTable(), getComputer());
	}
	*/
	public void print() {
		System.out.println("LabRoom has "+"Chair: "+getChair()
				+ ", Table: "+getTable() + " and Computer: "+getComputer());
	}
	
	public void addChair(int number) {
		this.chair += number;
	}
	public void addTable(int number) {
		this.table += number;
	}
	public void addComputer(int number) {
		this.computer += number;
	}
	
	public void removeChair(int number) {
		this.chair -= number;
	}
	public void removeTable(int number) {
		this.table -= number;
	}
	public void removeComputer(int number) {
		this.computer -= number;
	}
}
