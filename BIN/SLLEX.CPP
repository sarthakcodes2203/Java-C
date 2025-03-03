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
void search(struct node *list);
void insertbegin(struct node *list);
void insertafter(struct node *list);
void insertbefore(struct node *list);
void inserttail(struct node *list);
void deletebegin(struct node *list);
void deletemiddle(struct node *list);
void deletetail(struct node *list);
int main()
{
int ch;
head=(struct node*)malloc(sizeof(struct node));
while(1)
{
printf("\n1-CREATE \n2-DISPLAY \n3-SEARCH \n4-INSERT AT BEGINNING \n5-INSERT AFTER \n6-INSERT BEFORE \n7-INSERT AT TAIL \n8-DEL;ETE FROM BEGINNING \n9-DELETE FROM MIDDLE \n10-DELETE FROM TAIL \n11-EXIT");
printf("\n ENTER YOUR CHOICE");
scanf("%d",&ch);
switch(ch)
{
case 1:
create(head);
break;
case 2:
display(head);
break;
case 3:
search(head);
break;
case 4:
insertbegin(head);
break;
case 5:
insertafter(head);
break;
case 6:
insertbefore(head);
break;
case 7:
inserttail(head);
break;
case 8:
deletebegin(head);
break;
case 9:
deletemiddle(head);
break;'
case 10:
deletetail(head);
break;
case 11:
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

void deletefirst(struct node *list)
{
	printf("Deleted element: %d",list->data);
	list=list->next;
	head=list;
}

