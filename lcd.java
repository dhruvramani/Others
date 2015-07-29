import java.util.Scanner;
import java.lang.Integer;
public class lcd {
	static int temp=0;
	//Arguments : Number to be printed , Column no. , Input size
	static void printMe(int numb,int index,int org)
	{
		//Creating the lines based on the input provided.
		String verticalLine=" ",HorLeft="",HorRight="",Hor="";
		for (int i=0;i<org+2;i++)
		{
				verticalLine+="-";
			if (i==0)
			{
				HorLeft+="|";
				Hor+="|";
			}
			else if (i==org+1)
			{
				Hor+="|";
				HorRight+="|";
			}
			else
			{
				Hor+="  ";
				HorRight+="  ";
				HorLeft+="  ";
			}
		}
		verticalLine+=" ";
		//Checking if the column has finished printing
		if(temp!=index)
		{
			System.out.println("");
			temp=index;
		}
		//Printing data in case of every digit.
		if (numb==1)
		{
			if((index!=0) && (index%(org+1)!=0) && index<(org+1)*2 )
			{
				System.out.print(HorRight+"  ");
			}
			if (index==0 || index==org+1 || index==(org+1)*2)
			{
				for(int i=0;i<3*org+1;i++)
					System.out.print(" ");
			}
		}
		if (numb==2)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(HorRight+"  ");
			else if(index>org+1 && index<(org+1)*2 )
				System.out.print(HorLeft+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
		}
		if (numb==3)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(HorRight+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(HorRight+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
		}
		if (numb==4)
		{
			 if( index<org+1 && index!=0)
				System.out.print(Hor+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(HorRight+"  ");
			else if( index==org+1)
				System.out.print(verticalLine+"  ");
			 if (index==0 ||  index==(org+1)*2)
				{
					for(int i=0;i<3*org+1;i++)
						System.out.print(" ");
				}
		}
		if (numb==5)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(HorLeft+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(HorRight+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
		}
		if (numb==6)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(HorLeft+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(Hor+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
		}
		if (numb==7)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(HorRight+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(HorRight+"  ");
			if (index==org+1 || index==(org+1)*2)
			{
				for(int i=0;i<3*org+1;i++)
					System.out.print(" ");
			}
		}
		if (numb==8)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(Hor+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(Hor+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
		}
		if (numb==9)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(Hor+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(HorRight+"  ");
			else if(index==(org+1)*2 || index==org+1)
				System.out.print(verticalLine+"  ");
			if (index==(org+1)*2)
			{
				for(int i=0;i<3*org+1;i++)
					System.out.print(" ");
			}
		}
		if (numb==0)
		{
			if (index==0)
				System.out.print(verticalLine+"  ");
			else if( index<org+1 && index!=0)
				System.out.print(Hor+"  ");
			else if(index>org+1 && index<(org+1)*2)
				System.out.print(Hor+"  ");
			else if(index==(org+1)*2)
				System.out.print(verticalLine+"  ");
			if (index==org+1)
			{
				for(int i=0;i<3*org+1;i++)
					System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Input");
		int size=scan.nextInt();
		scan.nextLine();
		String numb=scan.nextLine();
		String [] array1=numb.split("");
		if (size>0 && size<100)
		for (int i=0;i<3*size+2;i++)//Cycling through the columns.
		{
			for (int j=0;j<array1.length;j++)//Cylcing through the digits.
			{
				if(array1[j]!=null && !array1[j].equals(""))
				 printMe(Integer.parseInt(array1[j]),i,size);
			}
		}
		System.out.println("Program Completed.");
	}

}
