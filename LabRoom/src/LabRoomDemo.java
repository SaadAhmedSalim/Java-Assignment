public class LabRoomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabRoom labroom2 = new LabRoom(20,20,20);   // create object of LabRoom
		LabRoom labroom3 = new LabRoom(20,18,15);	// create object of LabRoom
		LabRoom lab1 = new LabRoom();
		lab1.print();
		
		labroom2.print();
		labroom3.print();
		// substraction
		int addChair = labroom2.getChair() 
				- labroom3.getChair();
		
		int addTable = labroom2.getTable() 
				- labroom3.getTable();
		
		int addComputer = labroom2.getComputer() 
				- labroom3.getComputer();
		
		System.out.println("Need to Substract "
				+ "LabRoom2 - LabRoom3 :");
		
		System.out.println("Chairs: "+addChair 
				+"  Tables: "+addTable 
				+"  Computers: "+addComputer);
		
		//Add all elements in labroom3
		System.out.println("After adding all "
				+ "elements in LabRoom3 : ");
		labroom3.addChair(addChair);
		labroom3.addTable(addTable);
		labroom3.addComputer(addComputer);
		
		labroom2.print();
		labroom3.print();
	}
}