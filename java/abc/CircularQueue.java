import java.util.Scanner;

public class CircularQueue {
    static int size = 5;
    static int[] a = new int[size];
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        int ch;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }

    public static void enqueue() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Circular Queue is Full");
        } else {
            if (rear == -1) {
                front++;
                rear++;
            } else {
                if (rear == size - 1 && front > 0) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            a[rear] = n;
        }
    }

    public static void dequeue() {
        int n;
        if (front == -1) {
            System.out.println("Circular Queue is Empty");
        } else {
            if (front == rear) {
                n = a[front];
                front = -1;
                rear = -1;
            } else {
                n = a[front];
                front++;
            }
            System.out.println("Deleted Element: " + n);
        }
    }

    public static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Circular Queue is Empty");
        } else if (front > rear) {
            for (int i = front; i < size; i++) {
                System.out.print(a[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
