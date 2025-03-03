#include<stdio.h>
#include<conio.h>
void main()
{
double da,hra,gs,pf,bs,ns;
clrscr();
printf("Enter basic salary");
scanf("%lf.2",&bs);
da=0.55*bs;
hra=0.15*bs;
gs=bs+da+hra;
pf=0.125*bs;
ns=gs-pf;
printf("\nGROSS SALARY:%lf",gs);
printf("\nNET SALARY:%lf",ns);
getch();
}




