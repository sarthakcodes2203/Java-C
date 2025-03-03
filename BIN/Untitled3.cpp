#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct node
{
int data;
struct node *next;
}node;
struct node *head;
void create(struct node *list);
void display(struct node *list);
void insertfirst(struct node *list);
int main()
{
int ch;
head=(struct node*)malloc(sizeof(struct node));
while(1)
{
printf("\n1-CREATE \n2-INSERT AT First Position \n3-DISPLAY \n4-EXIT");
printf("\n ENTER YOUR CHOICE");
scanf("%d",&ch);
switch(ch)
{
case 1:
create(head);
break;
case 2:
insertfirst(head);
break;
case 3:
display(head);
break;
case 4:
exit(0);
default:
printf("\n WRONG CHOICE");
}
}
return 0;
}
void create(struct node *list)
{
char p;
printf("\n Enter data:");
scanf("%d",&list->data);
list->next=(struct node*)malloc(sizeof(struct node));
printf("\nDo you want to continue(Y or N)? ");
p=getch();
if(p=='Y'||p=='y')
create(list->next);
else
list->next=NULL;
}
void display(struct node *list)
{
if(list==NULL)
printf("\nLinked list is empty");
else
while(list=NULL)
{
	printf("%d",list->data);
	list=list->next;
	}	
}
void insertfirst(struct node *list)
{
	struct node *t;
	t==(struct node*)malloc(sizeof(struct node));
	printf("Enter a value to be inserted");
	scanf("%d",&t->data);
	t->next=list;
	head=t;
}
