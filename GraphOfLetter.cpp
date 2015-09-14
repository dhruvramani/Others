/*
  Prints Graph Of letters - Edited for Borland C++
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
#include <stdio>

struct foo{
	char x,y;
	int size;
};

void main(){  
    //TODO - Complete for all the letters
	foo a[24][10]=
	{
		{{'+','-',20},{'+','`',10},{'+','+',20}},                                                 //A
		{{'`','-',20},{'+','`',10},{'`','+',10},{'-','`',8},{'`','+',2},{'+','`',8},{'`','+',8}}, //B
		{{'`','-',20},{'+','`',10},{'`','+',5},{'-','`',8},{'`','+',10},{'+','`',8},{'`','+',5}}, //C
	};

	char n[20];
	int currX=20,currY=10;
	gets(n);
	for(int i=0;i<strlen(n);i++) 
	{
		int index=int(tolower(a[i])-'a');
		for(int j=0;j<sizeof(a[index])/sizeof(a[index][0]);j++)
		{	
			int count=0;
			while(count<=a[index][j].size)
			{
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
	getch();
}
