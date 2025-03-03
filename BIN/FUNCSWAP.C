#include<stdio.h>
#include<conio.h>

void swap(int,int);
void main()
{
int a,b;
clrscr();
printf("Enter 2 numbers");
scanf("%d %d", &a ,&b);
swap(a,b);
getch();
}
void swap(int x,int y)
{
x=x+y;
y=x-y;
x=x-y;
printf("AFTER SWAP:%d %d",x,y);
}