
// public class java {
//     public static void main(String args [] ) {
       
//     }
// }

// //-----------------------------------Templates for Java




// public class java {
//     public static void main(String args [] ) {
//         System.out.print("1 2 3 4 5 6\n");
//         System.out.print("Ankit\n");
//         System.out.print("Coder ");
//     }
// }
// //--------------------------------------boiler plate code for java 


//============================================== Variables And DataTypes in Java ================================



// public class java {
//     public static void main(String args [] ) {
//         int a = 10;
//         int b = 5;
//         // System.out.println(a);
//         System.out.println(b);
//         String name = "Ankit";
//         System.out.println(name);
//         name="Coder";
//         System.out.println(name);
//          a = 30;
//         System.out.println(a);
//   }
// }
// //   -----------------------------------------------Variables in Java 




// public class java {
//     public static void main(String args [] ) {
//        byte a = 7;
//        System.out.println(a);
//        char an = 'A';
//        System.out.println(an);
//        boolean var = false;
//        double price = 11.2;
//        short n = 230;
//        System.out.println(var);
//        System.out.println(price);
//     }
// }
//  //  ---------------------------------------Data Types in java 




// public class java {
//     public static void main(String args [] ) {
//        int a = 10;
//        int b = 5;
//        int sum = a+b;
//        System.out.println(sum);
//     }
// }
// //-------------------- Sum of two number -------------------------




// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       // String input = sc.next();
//       // String input = sc.nextLine();
//       // int num = sc.nextInt();
//       float price = sc.nextFloat()
//       System.out.println(price); 
//     }
// }
// //-----------------------------------  Input in Java 




// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int sum = a+b;
//       System.out.println(sum); 
//     }
// }
// //----------------------------------- Sum of 2 numbers by taking i/p from the user.





// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       float a = sc.nextFloat();
//       float  b = sc.nextFloat();
//       float Product = a*b;
//       System.out.println(Product); 
//     }
// }
////--------------------------------------- Product of 2 numbers by taking i/p from the user.




// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       float rad = sc.nextFloat();
//       float area = 3.14f * rad *rad;
//       System.out.println(area); 
//     }
// }
// //----------------------------------- AREA of a circle i/p from the user.




// import java.util.*;

// public class java {
//     public static void main(String args [] ) {
//        Scanner sc = new Scanner(System.in);
//       //  int a = 12;
//       //  float b =  a;
//       char ch = 'A';
//       char ch2 = 'b';
//       int num = ch;
//       int num2 = ch2;
//        System.out.println(num);
//        System.out.println(num2);

//     }
// }
// //--------------------------------------------------------------- Type Casting in java .





// public class java {
//     public static void main(String args [] ) {
//      //---------------------------Start type promotion (a) 
//        char a = 'a';
//        char b = 'b';
//        System.out.println((int)(b));
//        System.out.println((int)(a));
//        System.out.println(a-b);
//       short a = 5;
//       byte b = 25;
//       char c = 'c';
//       byte bt = (byte) (a + b + c); 
//       System.out.println(bt);
//       //---------------------------End type promotion (a)

//      //-------------------------------Start type promotion (b)
//       int a = 14;
//       float b = 25.75f;
//       long c = 20;
//       double d = 30;
//       double sum = a + b + c + d ;
//       System.out.println(sum);
//     }
// }
// // -------------------------- Type Promotion in Expression in JAVA 



//========================================================  Questions Practice Set 1 ==========================================



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();
//       int Avarge = (a+b+c)/3;
//       System.out.println("Avarge of three num\t"+Avarge); 
//     }
// }
////------------------  QUESTION NUM:1 (Avarge of three num like a, b c )-------------------------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       Float side1 = sc.nextFloat();
//       Float side2 = sc.nextFloat();
//       Float Area = (side1*side2);
//       System.out.println("Area of SquRE/t"Area); 
//     }
// }
// // ------------ Question Num:2 ( Area of SquRE )-------------------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       Scanner sc = new Scanner(System.in);
//       Float pencil = sc.nextFloat();
//       Float pen = sc.nextFloat();
//       Float eraser = sc.nextFloat();
//       Float Total = (pencil+pen+eraser);
//       System.out.println("Total Cost for all items______"+Total); 
//       Float newTotal = Total + (0.18f * Total);
//       System.out.println("Total Cost with 18% GST for all items________" + newTotal);
//     }
// } 
// //------------- Question Num:3 ( totsl cost of 3 items )------------With 18%  GST ----------------




//============================================== Operators in java ================================



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int a = 10;
//       int b = 5;
//       System.out.println("Addition of two number______"+ (a+b));
//       System.out.println("Substraction of two number______"+ (a-b));
//       System.out.println("Multiplication of two number______"+ (a*b));
//       System.out.println("Devide of two number______"+ (a/b)); 
//       System.out.println("Modulo or Reminder of two number______"+ a%b);
//     }
// }
// //-------------------------------------------- 1. Arithmatic (binary)  Operators -----------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int a = 10;
//       int b = a--;
//       System.out.println(a);
//       System.out.println(b);
      
//     }
// }
// //----------------------------Arithmatic (unary)  Operators -----  (Increment) &  (Decrement) -----------------

//=======================  Practice On QUESTION related to unary Operator  ===========================


// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//     //   int a = 4;
//     //   int b = ++a;
//     //-------------------------firstly value change after that value use------------------
//     //   int a = 4;
//     //   int b = a++; 
//     //-------------------------firstly value use after that value change------------------    
//       System.out.println(a);
//       System.out.println(b);
      
//     }
// }


//===================================================================================================


// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int a = 10;
//       int b = 7;
//       System.out.println(a == b);        // equal to     
//       System.out.println(a != b);        // not equal to 
//       System.out.println(a > b);         // greater than 
//       System.out.println(a < b);         // less than 
//       System.out.println(a >= b);        // greater or equal to 
//       System.out.println(a <= b);        // less than equal to 
//     }
// }
// //-------------------------- Relational Operator (==) (!=) (>) (<) (>=) (<=) Check -----------------------




// import java.util.*;
// public class java {
//     public static void main(String args [] ) {          //  st1   st2      ans
//       System.out.println( (6>5) && (10!=5) );           //  T    T      =  T
//       System.out.println( (6<5) && (10!=5) );           //  F    T      =  F
//       System.out.println( (6>5) && (10<=5) );           //  T    F      =  F
//       System.out.println( (6<5) && (10<5) );            //  F    F      =  F
//     }
// }
// // //----------------------------------- Logical Operators AND (&& -- [Logical AND] ) ---------------------------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {          // st1    st2        ans
//       System.out.println( (6>5) || (10!=5) );           //  T    T       =  T
//       System.out.println( (6<5) || (10!=5) );           //  F    T       =  T
//       System.out.println( (6>5) || (10<=5) );           //  T    F       =  T
//       System.out.println( (6<5) || (10<5) );            //  F    F       =  F
//     }
// }
// //----------------------------------- Logical Operators OR ( || -- [Logical OR] ) ---------------------------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {            //statement      Answer
//       System.out.println( !( 6>5 ) );                      //     T       =  F
//       System.out.println( !( 10<5 ) );                     //     F       =  T
//     }
// }
// //----------------------------------- Logical Operators NOT ( ! -- [Logical NOT] ) ---------------------------------





// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int a = 10;
//       int b = 7;
//       System.out.println(a == b);        //      
//       System.out.println(a != b);        // 
//       System.out.println(a > b);         // 
//       System.out.println(a < b);         //
//       System.out.println(a >= b);        // 
//     }
// }
// //-------------------------- Assignment Operators (=) (+=) (-=) (*=) (/=)  Check -----------------------




//==================================== Practice QUESTION Set 2 (Operators Topic)  ===============================


// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int x = 2;
//       int y = 5;

//       int exp1 = (x*y/x);
//       //System.out.println(exp1);
//         System.out.println(exp1 + ",");

//       int exp2 = ( x* (y/x));
//       //System.out.println(exp2);
//       System.out.println(exp2);
      
//     }
// }
//------------------------------------ Ques Num 1 (What will be the output )---------------------------




// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int x = 200;
//       int y = 50;
//       int z = 100;

//       if (x>y  && y>z) {
//         System.out.println("Hello");
//       }

//       if (z>y  && z<x) {
//         System.out.println("java");
//       }
      
//       if ((y+200)<x  && (y+150) < z) {
//         System.out.println("Hello java");
//       }
      
//     }
// }
// //------------------------------ Ques Num 2 ( What will be the output )  --------------------------------



// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int x , y, z;
//       x = y = z = 2;
//       x += y ;
//       y -= z;
//       z /= (x+y);
//       System.out.println(x+ " " + y + " " + z);
//     }
// }
//--------------------------------- Ques Num 3 ( What will be the output ) ----------------------------------





// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int x = 9, y = 12;
//       int a = 2, b = 4, c = 6;

//       int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

//       System.out.println(exp);
//     }
// }
// //------------------------------- Question num 4 (What will be the output) --------------------------





// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//       int x = 10, y = 5;

//       int exp1 = (y * (x / y + x / y));
//       int exp2 = (y * x / y + y * x / y);

//       System.out.println(exp1);
//       System.out.println(exp2);
//     }
// }
// ------------------------------------ Question num 5 ( What will be the output ) ------------------


//=================================== 4. Conditional Statement ================================

// ---------------------------- if, else if , else Concept ------------------------------

// Some Conditions--
// income < 5 lakhs = 0% tax
// income between 5 to 10 lakhs = 20% tax
// income above 10 lakhs = 30% tax

// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the amount");
//         int income = sc.nextInt( );
//         int tax;
//         if(income < 500000){
//             tax = 0;
//         }
//         else if (income>= 500000 && income<1000000){
//             tax = (int) (income * 0.2);
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("Your tax is :" +tax);
//     }
// }
//------------------------ Program of Income Tax Calculator by using if , else if , else --------------




// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value");
//         int a = sc.nextInt( );
//         int b = sc.nextInt( );
//         int c = sc.nextInt( );
//         if(a>=b && a>c){
//             System.out.println("Largest is A");
//         }
//         else if(b>=c){
//             System.out.println("Largest is B");
//         }
//         else{
//             System.out.println("Largest is C");
//         }
//     }
// }
// -------------- Print the largest three num by taking input from the user ----------------



// public class java {
//     public static void main(String args [] ) {
//        int num = 55;
//        String type = (num%2==0)? "even" : "odd";
//        System.out.println(type);
//     }
// }
// ------------- Using Ternary Operator \ Check num is ODD or Even  .................




// public class java {
//     public static void main(String args [] ) {
//        int marks = 78;
//        String ScoreCard = (marks>=33) ? "Pass" : "Fail";
//        System.out.println(ScoreCard);
//     }
// }
// ------------- Using Ternary Operator \ Check Student will Passed or fail .................




// public class java {
//     public static void main(String args [] ) {
//        int num  = 3;
//        switch(num) {
//         case 1 : System.out.println("Mango");
//                 break;
//         case 2 : System.out.println("Banana");
//                 break;
//         case 3 : System.out.println("Orange");
//                 break;
//         case 4 : System.out.println("Kiwi");
//                 break;
//         default : System.out.println("Just Dreaming and wake up");
//        }
//     }
// }
//--------------------------- Using Switch Statement -------------------




// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value");
//         int a = sc.nextInt( );
//         int b = sc.nextInt( );
//         char Operator = sc.next( ).charAt(0);
//         switch(Operator){
//             case '+' : System.out.println(a+b);
//             break;
//             case '-' : System.out.println(a-b);
//             break;
//             case '*' : System.out.println(a * b);
//             break;
//             case '/' : System.out.println(a/b);
//             break;
//             default : System.out.println("Error");
//         }
//     }
// }
// ------------------------------- Calculator --------------------------------------



// ==================================================== Practice Set : 3 =====================================


// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value");
//         int num = sc.nextInt( );
//         if(num > 0){
//             System.out.println("num is greater than 0");
//         }
//         else {
//             System.out.println("num is less than 0 ");
//         }
//     }
// }
// --------------------- // Ans No.1 //  Check num is positive or negative ------------------------


// public class java {
//     public static void main (String args[ ] ) {
//         double temp =  103.5;
//         if(temp>100){
//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println(" you don't have a fever");
//         }
//     }
// }
// ---------------------- // Ans No. 2  // ----------------------------------------


// import java.util.*;
// public class java {
//     public static void main(String args [] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the week number which is 1 to 7");
//        int num  = sc.nextInt();
//        switch(num) {
//         case 1 : System.out.println("MONDAY");
//                 break;
//         case 2 : System.out.println("TUESDAY");
//                 break;
//         case 3 : System.out.println("WEDNESDAY");
//                 break;
//         case 4 : System.out.println("THURSDAY");
//                 break;
//         case 5 : System.out.println("FRIDAY");
//                 break;
//         case 6 : System.out.println("SATURDAY");
//                 break;       
//         case 7 : System.out.println("SUNDAY");
//                 break;
//        }
//     }
// }
// ---------------- // Ans No. 3 // Enter the week number which is 1 to 7 ================


// public class java {
//     public static void main(String args [] ) {
//         int a = 63, b = 36;
//         boolean x = (a < b)? true : false;
//         // int y = (a>b)? a : b;
//     }
// }    
// ====================== Ans No. 4 --------------------------------------


// import java.util.*;
// public class java {
//     public static void main (String args[ ] ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the year");
//         int year = sc.nextInt( );
//         if(year%4 !=0){
//             System.out.println("Not a leap Year");
//         }
//         else if (year %100 !=0){
//            System.out.println("leap Year"); 
//         }
//         else if (year %400 !=0) {
//             System.out.println("Not a leap Year");
//         }
//         else{
//             System.out.println("leap Year"); 
//         }
//     }
// }
// ==========------------------ Ans No. 5 // Cheak Leap Year or Not ======================================




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
// public class java {
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





