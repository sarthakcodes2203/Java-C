import java.util.Scanner;

public class QueueExample {
    private static final int SIZE = 5;
    private static int[] queue = new int[SIZE];
    private static int front = 0;
    private static int rear = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1-Insert");
            System.out.println("2-Delete");
            System.out.println("3-Display");
            System.out.println("4-Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
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

    public static void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Element: ");
        int element = scanner.nextInt();

        if (rear == SIZE) {
            System.out.println("QUEUE OVERFLOW");
        } else {
            queue[rear] = element;
            rear++;
        }
    }

    public static void delete() {
        if (front == rear) {
            System.out.println("QUEUE UNDERFLOW");
        } else {
            int element = queue[front];
            front++;
            System.out.println("Deleted element: " + element);
        }
    }

    public static void display() {
        if (front == rear) {
            System.out.println("QUEUE IS EMPTY");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i < rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
