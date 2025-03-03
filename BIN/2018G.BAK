#include<stdio.h>
#include<conio.h>
double fact(int a)
{
int f=0.0;
int i;
for(i=1;i<=a;i++)
{
f=f*i;
}
return f;
}
void main()
{
double sum=1.0;
int n,x,i,j;
clrscr();
printf("Enter the value of N,x");
scanf("%d %d",&n,&x);
for(i=1,j=3;i<=n-1;i++,j=j+2)
{
sum=sum+pow(x,j)/fact(j);
}
getch();
}