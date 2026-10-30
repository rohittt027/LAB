package SelfPractice;

public class TLTStarPattern {
    public static void main(String[] args) {

        int num = 4;

        for (int row = 4; row >=num; row--) {
            for (int col = 1; col <= num; col++) {
                System.out.print("*");
            }                                                                                                                   
            System.out.println();
        }
    }

}
