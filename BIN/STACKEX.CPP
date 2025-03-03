#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void push();
void pop();
void display();
int size=5,a[5];
int top=-1;
int main()
{
int ch;
while(1)
{
printf("\n 1-PUSH");
printf("\n 2-POP");
printf("\n 3-DISPLAY");
printf("\n 4-EXIT");
printf("Enter your choice=");
scanf("%d",&ch);
switch (ch)
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
printf("\n WRONG CHOICE");
}
}
return 0;
}
void push()
{
int n;
printf("Enter a number");
scanf("%d",&n);
if(top==size-1)
printf("\n Sack overflow");
else
{
top++;
a[top]=n;
}
}
void pop()
{
int n;
if(top==-1)
printf("stack underflow");
else
{
n=a[top];
printf("\n DELETED ELEMENT= %d",n);
top--;
}
}
void display()
{
int i;
if(top==-1)
printf("Stack is empty");
else
{
for(i=top;i>=0;i--)
printf("\n &d",a[i]);
}
}

