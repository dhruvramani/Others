#include <iostream>

typedef char string[20];

void printDashes(int a[])
{
	cout<<"+";
   for(int i=0;i<2;i++) {
   	for(int j=0;j<a[i];j++)
      	cout<<"-";
      cout<<"+";
   }
   cout<<"\n";
}

int main()
{
	const int r=3,c=2;
	string a[r][c]={{"Hello","World1121"},{"Fooooo","Bar"},{"Baz","QUU"}};
	int maxLen[c];

   for(int i=0;i<c;i++)
   {
   	int max=strlen(a[0][i]);
      for(int j=0;j<r;j++)
      	if(strlen(a[j][i])>max)
         	max=strlen(a[j][i]);
      maxLen[i]=max;
   }

   printDashes(maxLen);
   for(int i=0;i<r;i++)
   {
   	if(i==1)
      	printDashes(maxLen);
   	for(int j=0;j<c;j++)
      {
      	cout<<"|";
         int k=0;
         for(;k<strlen(a[i][j]);k++)
         	cout<<a[i][j][k];
         for(;k<maxLen[j];k++)
         	cout<<" ";
         if(j==c-1)
         	cout<<"|";
      }
      cout<<"\n";
   }
   printDashes(maxLen);
   return 0;
}