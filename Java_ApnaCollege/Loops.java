////===============================  5. LOOPS   ( Flow Control )  ===================================

//  There are 3 type of loops in java like 
// 1st is for loop and 2nd is While loop and 3rd is Do While loops.
//===============@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  While Loop @@@@@@@@@@@@@@@@@@@@@@==========================

// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         int counter = 0;
//         while(counter<20){
//             System.out.println("welcome the world of Java");
//             counter++;
//         }
//         System.out.println(" I have printed this statement Atleast 20 times. ");
//     }
// }
// ------------- simple while loops ==================




// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         int counter = 1;
//         while(counter<=10){
//             System.out.println(counter);
//             counter++;
//         }
//         System.out.println(" I have printed the Number 1 to 10. ");
//     }
// }
// --------------------------- Using While loops, Print 1 to 10 numbers. -----------------


// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         int counter = 1;
//         while(counter<=50){

//             // if(counter%2 == 0){
//             //     System.out.println(counter);
//             // }
//             // this is for only even num.

//             if(counter%2 == 1){
//                 System.out.println(counter);
//             }
//             // this is for only odd num.

//             counter++;
//         }
//         System.out.println(" I have printed the Number 1 to 50. ");
//     }
// }
// // --------------------- Print the even or odd num using while loops between 1 to 50 .



// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner (System.in);
//         int range = sc.nextInt();
//         int counter = 1;
//         while(counter<=range){
//             System.out.println(counter);
//             counter++;
//         }
//         System.out.println(" I have printed the Number 1 to n (n have taken from the user). ");
//     }
// }
// ------------------------  print num from 1 to n by taking input from the user. -----------------------




// import java.util.*;
// public class Loops {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while(i <=n){
//             sum = sum+i;
//             i++;
//         }
//         System.out.println(" Sum is  " +sum);
//     }
// }
// ------------------- print Sum of first n natural numbers ------------------

// ================@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    For loops   @@@@@@@@@@@@@@@@@@@@@@@@================