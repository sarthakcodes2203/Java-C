#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insertfront();
void insertrear();
void deletefront();
void deleterear();
void display();
int size=5;
int a[5];
int front=0,rear=0;

int main()
{
int ch;
clrscr();
while(1)
{
printf("\n1.INSERT FRONT");
printf("\n2.INSERT REAR");
printf("\n3.DELETE FRONT");
printf("\n4.DELETE REAR");
printf("\n5.DISPLAY");
printf("\n6.EXIT");
printf("\nEnter your choice ");
scanf("%d",&ch);
switch(ch)
{
case 1:
insertfront();
break;
case 2:
insertrear();
break;
case 3:
deletefront();
break;
case 4:
deleterear();
break;
case 5:
display();
break;
case 6:
exit(0);
default:
printf("\nWrong Choice");
}
}
return 0;
}

void insertrear()
{
int n;
printf("\nEnter a number ");
scanf("%d",&n);
if(rear==size)
{
printf("\nDEQueue is full, can't insert from rear");
}else{
a[rear]=n;
rear++;
}
}

void deletefront()
{
int n;
if(rear==front)
{
printf("\nDEQueue is Empty, can't delete from front");
}else{
n=a[front];
printf("\nDeleted Element=%d",n);
front++;
}
}

void display()
{
int i;
if(rear==front)
{
printf("\nDEQueue is Empty");
}else{
for(i=front;i<rear;i++)
{
printf("\n%d",a[i]);
}
}
}

void insertfront()
{
int n;
printf("\nEnter a number ");
scanf("%d",&n);
if(front<=0)
{
printf("\nDEQueue is full, can't insert from front");
}else{
front--;
a[front]=n;
}
}

void deleterear()
{
int n;
if(rear==front)
{
printf("\nDEQueue is Empty, can't delete from front");
}else{
rear--;
n=a[rear];
printf("\nDeleted Element=%d",n);
}
}