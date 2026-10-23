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

// import java.util.Scanner;

// public class LoopPracticeQs {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.print("enter the number :");
//             number = sc.nextInt();

//             if (number % 2 == 0) {

//                 evenSum += number;

//             } else {

//                 oddSum += number;
//             }

//             System.out.print("do you want to continue? press 1 for yes or 0 for no :");

//             choice = sc.nextInt();
//         } while (choice == 1);

//         System.out.println("sum of even number :" + evenSum);
//         System.out.println("sum of odd number :" + oddSum);

//         sc.close();

//     }
// }

// -------------------------------------------------------------------------------------------------------

//  Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;

public class LoopPracticeQs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int fact = 1;

        System.out.print("enter any positive integer :");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;

        }

        System.out.println("factorial number = " + fact);

        sc.close();
    }
}
