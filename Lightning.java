class Untitled {
	public static void main(String[] args) {
		int n=4;
		System.out.println(" ___");
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=4;j++)
			{
				for (int k=0;k<j;k++)
					System.out.print(" ");
				System.out.println("\\  \\");
			}
			if (i == n-1) 
				System.out.print("     \\ /\n      ");
			else
				System.out.print("----    \\\n\\   _____\\ \n");
		}
	}
}