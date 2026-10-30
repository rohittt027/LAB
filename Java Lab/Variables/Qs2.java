package Variables;

import java.util.Scanner;

// Question 2: In a program, input the side of a square. You have to output the area of the square.

public class Qs2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter side :");
        int side = sc.nextInt();
        int aos = side * side;

        System.out.println("area of square = " + aos);

        sc.close();
    }

}
