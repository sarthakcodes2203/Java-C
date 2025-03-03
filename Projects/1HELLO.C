#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,j,t=0,a[100];

printf("Enter array elements");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter array elements");
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[j]>a[j=1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(i=0;i<n;i++)
{
printf("AFTER SORT:%d",a[i]);
}
getch();
}
