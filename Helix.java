class Untitled 
{
	public static void main(String[] args) 
	{
		int n=-50;
		if (n>0) 
			pos(n);
		else if(n<0)
			neg(0-n);
		else
			System.out.println("Nothing for you");
	}
	
	static void pos(int n)
	{
		for (int i=0;i<n;i++) 
			System.out.print(" /\\");
		System.out.println("");
		
		for (int i=0;i<=n;i++) 
		{
			if (i==0 || i==n) 
				System.out.print("O");
			else
				System.out.print("/");
			
			System.out.print("  ");
		}
		System.out.println("");
		
		for (int i=0;i<n;i++) 
			System.out.print(" \\/");
	}
	
	static void neg(int n)
		{
			System.out.println("  O");
			
			for (int i=0;i<n;i++) 
			{
				System.out.println(" / \\\n \\ /");
				if (i!=n-1) 
					System.out.println("  /");
			}			
			System.out.print("  O");
		}
	
}