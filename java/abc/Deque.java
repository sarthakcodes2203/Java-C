public class Deque {
    private int size;
    private int[] arr;
    private int front;
    private int rear;

    public Deque(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    public void insertFront(int newItem) {
        if (front <= 0) {
            System.out.println("DEQueue is full, can't insert from front");
        } else {
            front--;
            arr[front] = newItem;
        }
    }

    public void insertRear(int newItem) {
        if (rear == size) {
            System.out.println("DEQueue is full, can't insert from rear");
        } else {
            arr[rear] = newItem;
            rear++;
        }
    }

    public void deleteFront() {
        if (rear == front) {
            System.out.println("DEQueue is Empty, can't delete from front");
        } else {
            int deletedElement = arr[front];
            front++;
            System.out.println("Deleted Element = " + deletedElement);
        }
    }

    public void deleteRear() {
        if (rear == front) {
            System.out.println("DEQueue is Empty, can't delete from rear");
        } else {
            rear--;
            int deletedElement = arr[rear];
            System.out.println("Deleted Element = " + deletedElement);
        }
    }

    public void display() {
        if (rear == front) {
            System.out.println("DEQueue is Empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.display();
        deque.deleteFront();
        deque.deleteRear();
        deque.display();
    }
}
