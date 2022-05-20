
public class Stringprog3 {
//Reverse String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Helloo Thinkquotient ";
		String str2="";
		int n=str1.length()-1;
		for(int i=n;i>=0;i--) {
			char c=str1.charAt(i);
			str2+=c;
		}
		System.out.println(str2);

	}

}
