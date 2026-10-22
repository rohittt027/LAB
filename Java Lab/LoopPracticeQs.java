// Question 1 : How many times 'Hello' is printed?

// public class LoopPracticeQs {
//     public static void main(String[] args) {

//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");

//             i += 2;
//         }
//     }

// }

// -------------------------------------------------------------------------------------------------------

// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers

import java.util.Scanner;

public class LoopPracticeQs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("enter your number :");
        number = sc.nextInt();

        if (number % 2 == 0) {
            evenSum = number;

        } else {
            oddSum = number;
        }

        choice = sc.nextInt();
        System.out.print("chose your choice : 1 is yes or 0 is no");

        if (choice == 1) {

        }
        System.out.println("even number sum is :" + evenSum);
        System.out.println("odd number sum is :" + oddSum);

        sc.close();

    }
}