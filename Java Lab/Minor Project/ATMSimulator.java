import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == correctPin) {

            System.out.println("Access Granted!");

            boolean isRunning = true;

            while (isRunning) {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("You selected Check Balance!");
                        break;

                    case 2:
                        System.out.println("You selected Deposit Money!");
                        break;

                    case 3:
                        System.out.println("You selected Withdraw Money!");
                        break;

                    case 4:
                        System.out.println("You selected Change PIN!");
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM!");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } else {
            System.out.println("Incorrect PIN!");
        }

        sc.close();
    }
}
