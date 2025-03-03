import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;
}

public class DoublyLinkedList {
    static Node head;
    static Node n1;
    static int i = 0;

    public static void main(String[] args) {
        head = new Node();
        while (true) {
            System.out.println("1-CREATE \n2-DISPLAY \n3-SORT \n4-DISPLAY REVERSE \n5-EXIT");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            switch (ch) {
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
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static void create(Node list) {
        Scanner scanner = new Scanner(System.in);
        char p;
        if (i == 0) {
            list.prev = null;
            list.next = new Node();
            System.out.println("Enter data");
            list.data = scanner.nextInt();
            n1 = list;
            i++;
        } else {
            list.prev = n1;
            list.next = new Node();
            System.out.println("Enter data");
            list.data = scanner.nextInt();
            n1 = list;
        }
        System.out.println("Do you want to continue Y/N?");
        p = scanner.next().charAt(0);
        if (p == 'Y' || p == 'y')
            create(list.next);
        else
            list.next = null;
    }

    public static void display(Node list) {
        if (list == null)
            System.out.println("Double Linked List is empty");
        else {
            while (list != null) {
                System.out.print(list.data + " ");
                list = list.next;
            }
            System.out.println();
        }
    }

    public static void disprev(Node list) {
        while (list.next != null) {
            list = list.next;
        }
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.prev;
        }
        System.out.println();
    }

    public static void sort(Node list) {
        while (list.next != null) {
            f(head);
            list = list.next;
        }
    }

    public static void f(Node list) {
        int temp;
        while (list.next != null) {
            if (list.data > list.next.data) {
                temp = list.data;
                list.data = list.next.data;
                list.next.data = temp;
            }
            list = list.next;
        }
    }
}
