 #include<stdio.h>
 #include<conio.h>
 #include<stdlib.h>
 typedef struct node
 {
 int data;
 struct node *next,*prev;
 };
 void create(struct node *list);
 void display(struct node *list);
 void sort(struct node *list);
 void disprev(struct node *list);
 void f(struct node *list);
 struct node *head;
 struct node *n1;
 int ch,i=0;
 void main()
 {
 head=(struct node *)malloc(sizeof(struct node));
 while(1)
 {
 printf("1-CREATE \n2-DISPLAY \n3-SORT \n4-DISPLAY REVERSE \n5-EXIT \n");
 printf("Enter your choice");
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
 sort(head);
 break;
 case 4:
 disprev(head);
 break;
 case 5:
 exit(0);
 default:
 printf("Wrong choice");
 }
 }
 }

 void create(struct node *list)
 {
 char p;
 if(i==0)
 {
 list->prev=NULL;
 list->next=(struct node *)malloc(sizeof(struct node));
 printf("\nEnter data");
 scanf("%d",&list->data);
 n1=list;
 i++;
 }
 else
 {
 list->prev=n1;
 list->next=(struct node *)malloc(sizeof(struct node));
 printf("\n Enter data");
 scanf("%d",&list->data);
 n1=list;
 }
 printf("Do you want to continue Y/N?");
 p=getch();
 if(p=='Y'||p=='y')
 create(list->next);
 else
 list->next=NULL;
 }

 void display(struct node *list)
 {
 if(list==NULL)
 printf("Double Linked List is empty");
 else
 {
 while(list!=NULL)
 {
 printf("%d",list->data);
 list=list->next;
 }
 }
 }

 void disprev(struct node *list)
 {
 while(list->next!=NULL)
 {
 list=list->next;
 }
 while(list!=NULL)
 {
 printf("%d",list->data);
 list=list->prev;
 }
 }

 void sort(struct node *list)
 {
 while(list->next!=NULL)
 {
 f(head);
 list=list->next;
 }
 }
 void f(struct node *list)
 {
 int temp;
 while(list->next!=NULL)
 {
 if(list->data > list->next->data)
 {
 temp=list->data;
 list->data = list->next->data;
 list->next->data=temp;
 }
 list=list->next;
 }
 }



