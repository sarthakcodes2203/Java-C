#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void enqueue();
void dequeue();
void display();
int size=5;
int a[5];
int front=-1,rear=-1;

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
enqueue();
break;
case 2:
dequeue();
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

void enqueue()
{
int n;
printf("\nEnter a number ");
scanf("%d",&n);
if((front==0 && rear==size-1) || (front==rear+1))
{
printf("\nCircular Queue is Full");
}else{
if(rear==-1){
front++;
rear++;
}else{
if(rear==size-1 && front>0)
{
rear=0;
}else{
rear++;
}
a[rear]=n;
}
}

void dequeue()
{
int n;
if(front==-1)
{
printf("\nCircular Queue is Empty");
}else{
if(front==rear)
{
n=a[front];
front=-1;
rear=-1;
}else{
n=a[front];
front++;
}
}
printf("\nDeleted Element=%d",n);
}

void display()
{
int i;
if(front==-1 && rear==-1)
{
printf("\nCircular Queue is Empty");
}else if(front>rear)
{
for(i=front;i<=size-1;i++)
{
printf("%d ",a[i]);
}
for(i=0;i<=rear;i++)
{
printf("%d ",a[i]);
}
}else{
for(i=front;i<=rear;i++)
{
printf("%d ",a[i]);
}
}
}