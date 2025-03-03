#include<stdio.h>
#include<conio.h>
int fact(int);
void main()
{
int n,m,r,s;
s=0;
clrscr();
printf("Enter a number");
scanf("%d",&n);
m=n;
while(n>0)
{
r=n%10;
s=s+fact(r);
n=n/10;
}
if(m==s)
printf("It is a strong number");
else
printf("It is not a strong number");
getch();
}
int fact(int x)
{
int i,p=1;
for(i=1;i<=x;i++)
p=p*i;
return p;
}
