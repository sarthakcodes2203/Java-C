#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insertn();
void delete1();
void display();
int size,a[5];
int f=0,r=0;
int main()
{
int ch;
while(1)
{
printf("\n1-Insert");
printf("\n2-Delete");
printf("\n3-Display");
printf("\n4-Exit");
printf("\nEnter your choice");
scanf("%d",&ch);
switch(ch)
{
case 1:
insertn();
break;
case 2:
delete1();
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
void insertn()
{
int n;
printf("Enter Element");
scanf("%d",&n);
if(r==size)
printf("\n QUEUE OVERFLOW");
else
{
a[r]=n;
r++;
}
}
void delete1()
{
int n;
if(r==f)
printf("\n QUEUE UNDERFLOW");
else
{
n=a[f];
f++;
printf("Deleted element= %d",n);
}
}
void display()
{
int i;
if(f==r)
printf("\n QUEUE IS EMPTY");
else
{
for(i=f;i<=r;i++)
printf("%d",a[i]);
}
}


