#include<stdio.h>
#include<conio.h>
int fact(int);
void check();
void check()
{
int n ,m,s;
printf("Enter a Number");
scanf("%d",&n);
m=n;
s=fact(n);
if(s==m)
printf("It is a Perfect number");
else
printf("It is not a perfect number");
}
int fact(int x)
{
int i,sum=0;
for(i=1;i<=x/2;i++)
{
if(x%i==0)
sum=sum+i;
}
return sum;
}
void main()
{
clrscr();
check();
getch();
}
