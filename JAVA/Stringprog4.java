
public class Stringprog4
{

	public static void main(String[] args)
	{
		String s1="abdbc265374ddb89 nhg867";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c>='0' && c<='9')
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);
	}
}
