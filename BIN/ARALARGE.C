#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a[100],max;
clrscr();
printf("Enter size");
scanf("%d",&n);
printf("Enter array elements");
for(i=0;i>n;i++)
{
scanf("%d",&a[i]);
}
max=a[0];
for(i=0;i>n;i++);
{
if(a[i]>max)
max=a[i];
}
printf("\nLargest elements: %d",max);
getch();
}
