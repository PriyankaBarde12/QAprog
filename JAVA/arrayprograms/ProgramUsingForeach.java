package com.arrayprograms;

public class ProgramUsingForeach {

	public static void main(String[] args) {
		
		int a[] = {34 ,7,89,7,8,-999,45,89 ,-999};
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==-999)
				continue;
			int cnt=1;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					cnt++;
					a[j]=-999;
				}

			}
			System.out.println(a[i]+" occurs " +cnt + " times");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[n];
		for(int b : arr)
		{
			b =sc.nextInt();
			System.out.println(b);
		}*/

	}

}
