class Untitled 
{
	public static void main(String[] args) 
	{
		int num=4;
		for (;num<10000;num++) 
		{
			for (int i=2;i<=num;i++) 
				if (base(num,i)) 
					System.out.println(num+" : "+i);
			System.out.println("\n\n");		
		}
	}
	
	static boolean base(int num,int base)
	{
		int [] digit=new int[100];
		for (int i=0;num!=0;i++) 
		{
			digit[i]=num % base;
			num/=base;
		}
		
		for (int i=0;i<digit.length;i++) 
			if (digit[i] != 0 && digit[i]!=1) 
				return false;
		return true;
	}
}