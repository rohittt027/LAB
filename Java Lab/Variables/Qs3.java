package Variables;

import java.util.Scanner;

// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

public class Qs3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter pencil price :");
        float pencil = sc.nextFloat();
        System.out.print("enter pen price :");
        float pen = sc.nextFloat();
        System.out.print("enter eraser price :");
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        float gst = (totalCost * 18 / 100);
        float finalBill = (totalCost + gst);

        System.out.println("total cost of 3 items is :" + totalCost);
        System.out.println("gst of 3 items is :" + gst);
        System.out.println("final bill with 18% gst is :" + finalBill);

        sc.close();

    }
}
