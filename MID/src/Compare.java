
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s5 = "Saad;Ahmed-Salim";
		int a = s5.indexOf(";");
		int b = s5.lastIndexOf("-");
		String s6 = s5.substring(a+1, b);
		System.out.println(s6);
		

	}

}
