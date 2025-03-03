import java.util.*;
public class AutomorphicChecker {
    public static boolean isAutomorphic(int number) {
        // Convert the number to a string
        String numStr = String.valueOf(number);

        // Calculate the square of the number
        long square = (long) number * number;

        // Convert the square to a string
        String squareStr = String.valueOf(square);

        // Compare the last digits of the original number and the square
        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        int num; // Replace this with the number you want to check
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        boolean isAutomorphicNumber = isAutomorphic(num);
        
        if (isAutomorphicNumber) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }
}