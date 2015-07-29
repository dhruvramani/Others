class Untitled 
{
	static int []n={1,2,8,9,0,1}; //Enter a single digit no. or else, you'll rot in hell
	static int size=n.length -1; 
	
	public static void main(String[] args) 
	{
		String [][]a={{"/\\","\\ \\","   \\/"}, //0
		              {"\\"," \\",""},          //1
		              {"/\\"," /","  \\/"},     //2 
		              {"/\\"," /\\","   /"},    //3
		              {" \\ ","\\/\\",""},      //4
		              {"/","\\/\\","    /"},    //5
		              {"/","\\/\\","  \\/"},    //6
		              {"/\\","  \\",""},        //7
		              {"/\\","\\/\\","  \\/"},  //8
		              {"/\\","\\/\\","   /"}};  //9
		
		int count=0;
		
		for(int i=0;i<3;i++)
		  	if(i==2) {
				spaces(count+1);
				if(count<size)
				   System.out.println(a[n[count+1]][0]+" "+a[n[count]][2]);
				else 
					System.out.println("   "+a[n[count]][2]);
				if(count!=size)
			       i=0; count++;
			} else {
				spaces(count);
				System.out.println(a[n[count]][i]);
			}
		
	}
	
	static void spaces(int count)
	{
		for(int i=0;i<(size-count+1)*4;i++)
			System.out.print(" ");
	}
	
}