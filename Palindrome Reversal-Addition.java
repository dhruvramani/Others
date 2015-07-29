class Untitled 
{
	static int pal(int a)
	{
		int s=0;
		while(a!=0)
		{
			s=s*10+a%10;
			a/=10;
		}
		return s;
		
	}
	public static void main(String[] args) 
	{
		int a=68,count=0; //Input : a
		while(a != pal(a))
		{
			a=a+pal(a);
			count++;
		}
		
		System.out.println(count);
	}
}