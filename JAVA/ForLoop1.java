class ForLoop1{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
			System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("..............................");
		for(char c='A';c<='E';c++){
			for (char c1='A';c1<='E' ;c1++ ) {
				System.out.print(c1);
			}
			System.out.println();
		}
		System.out.println("..............................");
		for(char c='A';c<='E';c++){
			for (char c1='A';c1<='E' ;c1++ ) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("..............................");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("..............................");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("..............................");
		for(int i=1;i<=5;i++){
			for(int j=5;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("..............................");
		int k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("..............................");
		int kk=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++)
			{	
				System.out.printf("%2d ",kk);	
				kk+=2;
			}
			System.out.println();
		}
		System.out.println("......................");
		int nn=2;
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(nn+" ");
				nn+=2;
			}
			System.out.println();
		}
		System.out.println("......................");
		//int nn=2;
		int a=5;
		for(int i=1;i<=a;i++){
			for(int j=1;j<=a;j++){
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		System.out.println("......................");
		int b=5;
		for(int i=1;i<=b;i++){
			for(int j=1;j<=b;j++){
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
	}
}