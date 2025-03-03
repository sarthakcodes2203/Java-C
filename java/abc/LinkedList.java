import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class LinkedList {
    static Node head;

    public static void main(String[] args) {
        int ch;
        head = new Node();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1-CREATE");
            System.out.println("2-DISPLAY");
            System.out.println("3-SEARCH");
            System.out.println("4-INSERT AT BEGINNING");
            System.out.println("5-INSERT AFTER");
            System.out.println("6-INSERT BEFORE");
            System.out.println("7-INSERT AT TAIL");
            System.out.println("8-DELETE FROM BEGINNING");
            System.out.println("9-DELETE FROM MIDDLE");
            System.out.println("10-DELETE FROM TAIL");
            System.out.println("11-EXIT");
            System.out.print("\nENTER YOUR CHOICE: ");
            ch = scanner.nextInt();
            switch (ch) {
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
                    insertBegin(head);
                    break;
                case 5:
                    insertAfter(head);
                    break;
                case 6:
                    insertBefore(head);
                    break;
                case 7:
                    insertTail(head);
                    break;
                case 8:
                    deleteBegin(head);
                    break;
                case 9:
                    deleteMiddle(head);
                    break;
                case 10:
                    deleteTail(head);
                    break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("\nWRONG CHOICE");
            }
        }
    }

    public static void create(Node list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        list.data = scanner.nextInt();
        list.next = null;
    }

    public static void display(Node list) {
        Node temp = list;
        if (temp == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void search(Node list) {
        int key, flag = 0, count = 0;
        Node temp = list;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        key = scanner.nextInt();
        while (temp != null) {
            count++;
            if (temp.data == key) {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag == 1) {
            System.out.println("Element " + key + " found at position " + count);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }

    public static void insertBegin(Node list) {
        Node newNode = new Node();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.next = list;
        head = newNode;
    }

    public static void insertAfter(Node list) {
        int key;
        Node newNode = new Node();
        Node temp = list;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element after which new node is to be inserted: ");
        key = scanner.nextInt();
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        while (temp != null) {
            if (temp.data == key) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element " + key + " not found");
        }
    }

    public static void insertBefore(Node list) {
        int key;
        Node newNode = new Node();
        Node temp = list;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element before which new node is to be inserted: ");
        key = scanner.nextInt();
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        if (temp.data == key) {
            newNode.next = temp;
            head = newNode;
        } else {
            while (temp != null) {
                if (temp.next.data == key) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Element " + key + " not found");
            }
        }
    }

    public static void insertTail(Node list) {
        Node newNode = new Node();
        Node temp = list;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.next = null;
        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void deleteBegin(Node list) {
        if (list == null) {
            System.out.println("List is empty");
        } else {
            head = list.next;
        }
    }

    public static void deleteMiddle(Node list) {
        int key, flag = 0;
        Node temp = list;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be deleted: ");
        key = scanner.nextInt();
        if (temp.data == key) {
            head = temp.next;
        } else {
            while (temp.next != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }
            if (flag == 0) {
                System.out.println("Element " + key + " not found");
            }
        }
    }

    public static void deleteTail(Node list) {
        Node temp = list;
        if (temp == null) {
            System.out.println("List is empty");
        } else if (temp.next == null) {
            head = null;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
}
