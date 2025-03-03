#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k,spc=3;
for(i=1;i<=4;i++)
{
for(j=1;j<=spc;j++)
{
printf(" ");
}
for(k=1;k<=i;k++)
{
printf("*");
}
printf("\n");
spc--;
}
getch();
}
