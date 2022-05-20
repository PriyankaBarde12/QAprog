
public class Stringprog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Manual tester";
		String s2=new String("Manual tester");
		System.out.println(str1);
		System.out.println(s2.toString());
		if(str1.equals(s2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
