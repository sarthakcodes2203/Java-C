#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

typedef struct node{
int data;
struct node *next;
};

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

void main()
{
int ch;
clrscr();
head=(struct node *)malloc(sizeof(struct node));
while(1)
{
printf("\n1.CREATE \n2.DISPLAY \n3.SEARCH \n4.INSERT BEGIN \n5.INSERT BEFORE \n6.INSERT AFTER \n7.INSERT TAIL \n8.DELETE BEGIN \n9.DELETE MIDDLE \n10.DELETE TAIL \n11.EXIT");
printf("\nEnter your choice: ");
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
insertbefore(head);
break;
case 6:
insertafter(head);
break;
case 7:
inserttail(head);
break;
case 8:
deletebegin(head);
break;
case 9:
deletemiddle(head);
break;
case 10:
deletetail(head);
break;
case 11:
exit(0);
default:
printf("\nWrong Choice");
}
}
//return 0;
}

void create(struct node *list)
{
char p;
printf("\nEnter data: ");
scanf("%d",&list->data);
list->next=(struct node *)malloc(sizeof(struct node));
printf("\nDo you want to continue(Y or N): ");
p=getch();
if(p=='Y' || p=='y'){
create(list->next);
}else{
list->next=NULL;
}
}
void display(struct node *list)
{
if(list==NULL){
printf("\nLinked List is empty");
}else{
while(list!=NULL){
printf("%d ",list->data);
list=list->next;
}
}
}

void search(struct node *list)
{
int fl=0,ser;
printf("\nEnter searching element: ");
scanf("%d",&ser);
while(list!=NULL){
if(ser==list->data){
fl=1;
break;
}
list=list->next;
}
if(fl==1){
printf("\nSearching element found");
}else{
printf("\nSearching element not found");
}
}

void insertbegin(struct node *list)
{
struct node *t;
t=(struct node *)malloc(sizeof(struct node));
printf("\nEnter value: ");
scanf("%d",&t->data);
t->next=list;
head=t;
}
void insertafter(struct node *list)
{
int ser,fl=0;
struct node *t;
t=(struct node *)malloc(sizeof(struct node));
printf("\nEnter searching element: ");
scanf("%d",&ser);
while(list!=NULL){
if(ser==list->data){
fl=1;
break;
}
list=list->next;
}
if(fl==1){
printf("\nEnter value: ");
scanf("%d",&t->data);
t->next=list->next;
list->next=t;
}else{
printf("\nSearching element not found");
}
}

void insertbefore(struct node *list)
{
int ser,fl=0;
struct node *t;
t=(struct node *)malloc(sizeof(struct node));
printf("\nEnter searching element: ");
scanf("%d",&ser);
while(list!=NULL){
if(ser==list->next->data){
fl=1;
break;
}
list=list->next;
}
if(fl==1){
printf("\nEnter value: ");
scanf("%d",&t->data);
t->next=list->next;
list->next=t;
}else{
printf("\nSearching element not found");
}
}

void inserttail(struct node *list)
{
struct node *t;
t=(struct node *)malloc(sizeof(struct node));
printf("\nEnter value: ");
scanf("%d",&t->data);
while(list->next!=NULL){
list=list->next;
}
list->next=t;
t->next=NULL;
}

void deletebegin(struct node *list)
{
printf("\nDeleted element is %d",list->data);
list=list->next;
head=list;
}

void deletemiddle(struct node *list)
{
int ser,fl=0;
printf("\nEnter searching element: ");
scanf("%d",&ser);
while(list->next!=NULL){
if(ser==list->next->data){
fl=1;
break;
}
list=list->next;
}
if(fl==1){
printf("\nDeleted element is %d",list->next->data);
list->next=list->next->next;
}else{
printf("\nSearching element not found");
}
}

void deletetail(struct node *list)
{
while(list->next->next!=NULL){
list=list->next;
}
printf("\nDeleted element is %d",list->next->data);
list->next=NULL;
}