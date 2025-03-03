#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insert();
void delet();
void display();
int N, a[100];
int front=-1,rear=-1;

int main()
{
int ch;
printf("Enter the valur of N ");
scanf("%d",&N);
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
insert();
break;
case 2:
delet();
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

void insert()
{
int num;
printf("\nEnter a number ");
scanf("%d",&num);
if((front==0 && rear==N-1) || (front==rear+1))
{
printf("\nCircular Queue is Full");
}else{
if(rear==-1){
front++;
rear++;
}else{
if(rear==N-1 && front>0)
{
rear=0;
}else{
rear++;
}
a[rear]=num;
}
}
}

void delet()
{
int num;
if(front==-1)
{
printf("\nCircular Queue is Empty");
}else{
if(front==rear)
{
num=a[front];
front=-1;
rear=-1;
}else{
num=a[front];
front++;
}

printf("\nDeleted Element=%d",num);
}
}

void display()
{
int i;
if(front==-1 && rear==-1)
{
printf("\nCircular Queue is Empty");
}else if(front>rear)
{
for(i=front;i<=N-1;i++)
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


