
public class strprog 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java language";
		//o/p=(e-3)
		System.out.println(getcount(s,'n'));
		System.out.println(getcount(s,'v'));
		System.out.println(getcount(s,'g'));
		System.out.println(getcount(s,'a'));
		
	}
	static int getcount(String s, char c) {
		return s.length()-s.replace(c+"","").length();
	}

}
