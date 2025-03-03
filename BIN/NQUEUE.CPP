#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insertQ();
void deleteQ();
void displayQ();
int size=5;
int a[5];
int front=0,rear=0;

int main()
{
int ch;
clrscr();
while(1)
{
printf("\n1.INSERT");
printf("\n2.DELETE");
printf("\n3.DISPLAY");
printf("\n4.EXIT");
printf("\nEnter your choice ");
scanf("%d",&ch);
switch(ch)
{
case 1:
insertQ();
break;
case 2:
deleteQ();
break;
case 3:
displayQ();
break;
case 4:
exit(0);
default:
printf("\nWrong Choice");
}
}
return 0;
}

void insertQ()
{
int n;
printf("\nEnter a number ");
scanf("%d",&n);
if(rear==size)
{
printf("\nQueue Overflow");
}else{
a[rear]=n;
rear++;
}
}

void deleteQ()
{
int n;
if(rear==front)
{
printf("\nQueue Underflow");
}else{
n=a[front];
printf("\nDeleted Element=%d",n);
front++;
}
}

void displayQ()
{
int i;
if(rear==front)
{
printf("\nQueue is Empty");
}else{
for(i=front;i<rear;i++)
{
printf("\n%d",a[i]);
}
}
}