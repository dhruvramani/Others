import java.lang.Math;

class Untitled {
	static int n=4;
	public static void main(String[] args) {
		int []a={19,22,24,25};
			int []b= new int[n];
			
			boolean found=false;
			for(int i=0;i<n-1;i++)
			{
				if(a[i+1] - a[i] > n)
				{
					found=true;
					System.out.println("Not a Jolly number");
					break;
				}
				else
					b[Math.abs(a[i+1]-a[i]) - 1]++;
			}

			if(found==false)
			{
				if (SearchForZero(a))
					System.out.println("Jolly number");
				else
					System.out.println("Not a Jolly number");
			}
			
	}
	
	static boolean SearchForZero(int[] a)
	{
		for (int i = 0; i < n; ++i)
			if(a[i]==0)
				return false;
		return true;
	}
}