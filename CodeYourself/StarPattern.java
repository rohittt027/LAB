// public class StarPattern {

//     public static void main(String[] args) {
//         int n = 5;

// SQUARE STAR PATTERN
//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= n; col++) {
//                 System.out.print("* ");

//             }
//             System.out.println();
//         }
//     }
// }

// --------------------------------------------------------------------------------------------------------

// public class StarPattern {

//     public static void main(String[] args) {
//         int n = 5;

//             // BOTTOM LEFT TRIANGLE
//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= n; col++) {
//                 if (row >= col) {
//                     System.out.print("*");

//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// --------------------------------------------------------------------------------------------------------

// public class StarPattern {

//     public static void main(String[] args) {

//         int n = 5;

//             // TOP LEFT TRIANGLE
//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= n; col++) {
//                 if (row + col <= n + 1) {
//                     System.out.print("* ");

//                 }
//             }
//             System.out.println();
//         }
//     }
// }