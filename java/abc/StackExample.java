import java.util.Scanner;

public class StackExample {
    private static final int SIZE = 5;
    private static int[] stack = new int[SIZE];
    private static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1-PUSH");
            System.out.println("2-POP");
            System.out.println("3-DISPLAY");
            System.out.println("4-EXIT");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("WRONG CHOICE");
            }
        }
    }

    public static void push() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (top == SIZE - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = num;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            int deletedElement = stack[top];
            System.out.println("DELETED ELEMENT: " + deletedElement);
            top--;
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
