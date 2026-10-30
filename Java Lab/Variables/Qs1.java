package Variables;

import java.util.Scanner;

// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

public class Qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a :");
        int a = sc.nextInt();
        System.out.print("enter b :");
        int b = sc.nextInt();
        System.out.print("enter c:");
        int c = sc.nextInt();
        int avg = ((a + b + c) / 3);

        System.out.println("average number is :" + avg);

        sc.close();
    }
}
