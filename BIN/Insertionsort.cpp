#include <stdio.h>
#include<conio.h>

void sort(int a[], int N) {
    int i, key, j;
    for (i = 1; i <N; i++) {
        key = a[i];
        j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
}
void display(int a[], int N)
{
	printf("Sorted array: \n");
    for (int i = 0; i <=N; i++)
        printf("%d ", a[i]);
}
int main() 
{
	int a[100],N,i;
	printf("Enter size of array\n");
	scanf("%d",&N);
	printf("Enter array elememts\n");
	  for (i = 1; i <=N; i++) {
	  	scanf("%d",&a[i]);
	  }
    sort(a, N);
    display(a,N); 
        return 0;
}
