class Untitled {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			int count=0;
			while (i+count<=5) 
			{
				for(int j=0;j<count;j++)
					System.out.print(i+j);
				count++;
				System.out.println("");		
			}
		}
	}
}