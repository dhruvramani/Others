import java.util.Scanner;

//In a 2D Array, array[row][column]

public class GE {
	public static String[][] image; //The array which we will work on.
	
	public static void I(int M,int N) //Creates an array with the dimensions provided.
	{
		image=new String[N][M];
		for (int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
				image[i][j]="0";
		}
	}
	
	public static void C()
	{
		if(image.length!=0) //Checking if it isn't null
			for(int i=0;i<image.length;i++)
			{
				for(int j=0;j<image[i].length;j++)
					image[i][j]="0";
			}
	}
	
	public static void L(int X,int Y,String C)
	{
		if(image.length!=0)
			if(C.length()==1)
				image[Y-1][X-1]=C;
	}
	
	public static void V(int X,int Y1, int Y2,String C)
	{
		if(image.length!=0)
			for(int i=Y1-1;i<=Y2-1;i++)
				image[i][X-1]=C;
	}
	
	public static void H(int Y,int X2,int X1,String C)
	{
		if(image.length!=0)
			for(int i=X1;i<X2;i++)
				image[Y-2][i]=C;
	}
	
	public static void K(int X1, int Y1, int X2, int Y2, String C)
	{
		if(image.length!=0)
			for(int i=X1-1;i<X2-1;i++)
			{
				for(int j=Y1-1;j<Y2-1;j++)
					image[j][i]=C;
			}
	}
	
	/*According to the question,function F(X,Y,C) does the following:-
	 * Fill the region R with the color C, where R is 
	 * defined as follows. Pixel (X, Y ) belongs to R. 
	 * Any other pixel which is the same color as pixel (X, Y ) and shares
	 * a common side with any pixel in R also belongs to this region.
	 * 
	 * Therefore When this function is called, the entire "Image" is set to color C.
	 */
	public static void F(String C) 
	{
		if(image.length!=0) 
			for(int i=0;i<image.length;i++)
			{
				for(int j=0;j<image[i].length;j++)
					image[i][j]=C;
			}
	}
	
	public static void S(String Name)
	{
		System.out.println(Name);
		if(image.length!=0) //Checking if it isn't null
			for(int i=0;i<image.length;i++)
			{
				for(int j=0;j<image[i].length;j++)
					System.out.print(image[i][j]);
				System.out.println("");
			}
		
	}
	
	public static void Print()
	{
		System.out.println(" The first argument is no. of COLUMNS and the second one is no. of ROWS");
		System.out.println("");
		System.out.println("I M N           - Create a new M × N image with all pixels initially colored white (O).");
		System.out.println("C               - Clear the table by setting all pixels white (O). The size remains unchanged.");
		System.out.println("L X Y C         - Colors the pixel (X, Y ) in color (C).");
		System.out.println("V X Y1 Y2 C     - Draw a vertical segment of color (C) in column X, between the rows Y 1 and Y 2 inclusive.");
		System.out.println("H X1 X2 Y C     - Draw a horizontal segment of color (C) in the row Y, between the columns X1 and X2 inclusive.");
		System.out.println("K X1 Y1 X2 Y2 C - Draw a filled rectangle of color C, where (X1,Y1) is the upper-left and (X2, Y 2) the lower right corner.");
		System.out.println("F C             - Colors the entire image with color C");
		System.out.println("S Name          - Write the file name in MSDOS 8.3 format followed by the contents of the current image.");
		System.out.println("X               - Terminate the session.");
		System.out.println("P               - Re-Prints this info. guide.");
	}
	
	public static void decideFunction(String func)
	{
		func=func.toUpperCase();
		String [] array=func.split(" ");
		//Okay, this would have been a lot better if switch statement worked with Strings.
		//All I am doing heres is calling method based on the Input.
		if(array[0].equals("I"))
			I(Integer.parseInt(array[1]),Integer.parseInt(array[2]));
		else if(array[0].equals("C"))
			C();
		else if(array[0].equals("L"))
			L(Integer.parseInt(array[1]),Integer.parseInt(array[2]),array[3]);
		else if(array[0].equals("V"))
			V(Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),array[4]);
		else if(array[0].equals("H"))
			H(Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),array[4]);
		else if(array[0].equals("K"))
			K(Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5]);
		else if(array[0].equals("F"))
			F(array[1]);
		else if(array[0].equals("S"))
			S(array[1]);
		else if(array[0].equals("P"))
			Print();
		else 
			System.out.println("Invalid Input (But don't worry, The program won't termiante untill you press 'X').");
	}
	
	public static void main(String[] args) 
	{
		
		Print();	
		Scanner scan=new Scanner(System.in);
		String ifXorNot=scan.nextLine();
		int count=1;
		while(!ifXorNot.equals("X"))
		{
			String StringToBeChecked;
			if(count==1)
			{
				StringToBeChecked=ifXorNot;
				decideFunction(StringToBeChecked);
				count++;
			}
			else
			{
				StringToBeChecked=scan.nextLine();
				decideFunction(StringToBeChecked);
				ifXorNot=StringToBeChecked;
			}
			
		}

	}

}
