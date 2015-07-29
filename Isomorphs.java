class Untitled 
{
	public static void main(String[] args) 
	{
		if(isomorph("RAMBUNCTIOUSLY").equals(isomorph("THERMODYNAMICS")))
			System.out.println("Isomorphs!");
		else 
			System.out.println("Not Isomorphs.");
	}
	
	static String isomorph(String str)
	{
		char []a=str.toCharArray(),b=new char[a.length];
		int count=0;
		
		for (int i=0;i<a.length;i++) 
		{
			b[i]=(char)('a'+count);
			for (int j=i-1;j>=0;j--) 
				if (a[i] == a[j]) 
					b[i]=b[j];
			count++;	
		}
		return String.copyValueOf(b);
	}
}