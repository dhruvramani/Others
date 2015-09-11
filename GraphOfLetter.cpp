/*
  Prints Graph Of letters - Code not tested yet
  eg. Input : MAIL
  Output :
  
     ....     ....           ....       ....   ....
    .    .   .    .         .    .      .  .   .  .
   .      ...      .       .      .     .  .   .  .
  .                 .     .        .    .  .   .   ...
 .                   .....          .....  .....     . 
 
 *Output maynot be as per the scale*
*/

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
	for(int i=0;n[i];n++) 
	{
		int index=int(n[i]-'a');
		for(int j=0;j<a[index].length;j++)
		{	
			int count=0;
			while(count!=a[index][j].size){
				
				if(a[index][j].x=='+')
					currX++;
				else if(a[index][j].x=='-')
					currX--;

				if(a[index][j].y=='+')
					currY++;
				else if(a[index][j].y=='-')
					currY--;
					
				count++;
				gotoxy(currX,currY);
				cout<<'.';
			}
		}
		cout<"....";
	}
}
