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
 void deletemiddle(struct node *list);
 struct node *head;
 struct node *n1;
 int ch,i=0;
 void main()
 {
 head=(struct node *)malloc(sizeof(struct node));
 while(1)
 {
 printf("1-CREATE \n2-DISPLAY \n3-DELETE from Middle \n4-EXIT \n");
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
 deletemiddle(head);
 break;
 case 4:
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



