class Untitled 
{
	public static void main(String[] args) 
	{
		print(0,10);
		print(5,8);
		print(6,12);
	}
	
	static void print(int starting, int ending)
	{
		for (int i=0;i<starting;i++) 
		 	System.out.print(" ");
		for (int i=starting;i<ending;i++)
			System.out.print("-"); 
		System.out.println("");
	}
}