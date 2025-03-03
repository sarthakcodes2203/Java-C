#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void push();
void pop();
void display();
int size=5;
int a[5];
int top=-1;

int main()
{
int ch;
clrscr();
while(1)
{
printf("\n1.PUSH");
printf("\n2.POP");
printf("\n3.DISPLAY");
printf("\n4.EXIT");
printf("\nEnter your choice ");
scanf("%d",&ch);
switch(ch)
{
case 1:
push();
break;
case 2:
pop();
break;
case 3:
display();
break;
case 4:
exit(0);
default:
printf("\nWrong Choice");
}
}
return 0;
}

void push()
{
int n;
printf("\nEnter a number ");
scanf("%d",&n);
if(top==size-1)
{
printf("\nStack Overflow");
}else{
top++;
a[top]=n;
}
}

void pop()
{
int n;
if(top==-1)
{
printf("\nStack Underflow");
}else{
n=a[top];
printf("\nDeleted Element=%d",n);
top--;
}
}

void display()
{
int i;
if(top==-1)
{
printf("\nStack is Empty");
}else{
for(i=top;i>=0;i--)
{
printf("\n%d",a[i]);
}
}
}