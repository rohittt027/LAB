package ContionalStatements;

import java.util.Scanner;

// Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

public class Qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your fever :");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("you have fever");

        } else {
            System.out.println("you have not fever");
        }
        sc.close();
    }

}
