
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Md;Ruhul-Amin";
		int a = s1.indexOf(";");
		int b = s1.lastIndexOf("-");
		String s2 = s1.substring(a+1, b);
		System.out.println(s2);
		

	}

}
