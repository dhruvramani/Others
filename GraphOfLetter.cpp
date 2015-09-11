//Code not tested yet

#include <iostream>
#include <conio>

struct foo{
	char x,y;
	int size;
};

int main(){  
    //TODO
	foo a[24][7]=
	{
		{{'+','-',20},{'+','`',10},{'+','+',20}}, //A
		{{'`',+'-',20},{'+','`',10},{'`','+',5},{'-','`',8},{'`','+',2},{'+','`',8},{'`','+',4}}, //B
	};

	string n;
	int currX=20,currY=10;
	gets(n);
	strcpy(n,tolower(n));
	for(int i=0;i<strlen(n);n++) 
	{
		int index=int(a[i]-'a');
		for(int j=0;j<a[index].length;j++)
		{	
			int count=0;
			while(1){
				
				if(a[index][j].x=='+')
					currX++;
				else if(a[index][j].x=='-')
					currX--;

				if(a[index][j].y=='+')
					currY++;
				else if(a[index][j].y=='-')
					currY--;
				
				if(count==a[index][j].size)
					break;
				count++;
				gotoxy(currX,currY);
				cout<<'.';
			}
		}
		cout<"....";
	}
}