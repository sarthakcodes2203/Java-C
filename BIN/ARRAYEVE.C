 #include<stdio.h>
 #include<conio.h>
 void main()
 {
 printf("Enter size:")
 scanf("%d",&n);
 printf("Enter array elements");
 for(i=0;i<n;i++)
 {
 scanf("%d",&a[i]);
 }
 for(i=0;i<n;i++)
 {
 if(a[i]%2==0)
 sum=sum+a[i];
 }
 printf("\nSum of even elements:",sum);
 getch();
 }

