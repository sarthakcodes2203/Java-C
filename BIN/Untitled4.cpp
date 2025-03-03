#include<stdio.h>
#include<conio.h>
int main()
{
	 int a[100],scr,fl=0,i,pos=0,n;
	 printf("Enter the size of array");
	  scanf("%d",&n);
	  printf("Enter the sorted array elements");
	  for(i=0;i<n;i++)
	  {
	  		 scanf("%d",&a[i]);
	  }
	  printf("Enter the Searching element");
	  scanf("%d",&scr);
	   int lb=0,ub=n-1;
	     while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(a[mid]>scr)
            ub=mid-1;
            if(a[mid]<scr)
            lb=mid+1;
            if(a[mid]==scr)
            {
                fl=1;
                pos=mid;
                break;
            }
        }
        if(fl==1)
		printf("Searching element present at %d", pos+1);
        else
     	printf("Searching element not found!!");
	 return 0;
}
