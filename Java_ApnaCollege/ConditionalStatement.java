//=================================== 4. Conditional Statement ================================

// ---------------------------- if, else if , else Concept ------------------------------

// Some Conditions--
// income < 5 lakhs = 0% tax
// income between 5 to 10 lakhs = 20% tax
// income above 10 lakhs = 30% tax

import java.util.*;
public class ConditionalStatement {
    public static void main (String args[ ] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int income = sc.nextInt( );
        int tax;
        if(income < 500000){
            tax = 0;
        }
        else if (income>= 500000 && income<1000000){
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is :" +tax);
    }
}
//------------------------ Program of Income Tax Calculator by using if , else if , else --------------




// import java.util.*;
// public class ConditionalStatement {
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



// public class ConditionalStatement {
//     public static void main(String args [] ) {
//        int num = 55;
//        String type = (num%2==0)? "even" : "odd";
//        System.out.println(type);
//     }
// }
// ------------- Using Ternary Operator \ Check num is ODD or Even  .................




// public class ConditionalStatement {
//     public static void main(String args [] ) {
//        int marks = 78;
//        String ScoreCard = (marks>=33) ? "Pass" : "Fail";
//        System.out.println(ScoreCard);
//     }
// }
// ------------- Using Ternary Operator \ Check Student will Passed or fail .................