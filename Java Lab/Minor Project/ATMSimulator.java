import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == correctPin) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Incorrect PIN!");
        }

        sc.close();
    }
}
