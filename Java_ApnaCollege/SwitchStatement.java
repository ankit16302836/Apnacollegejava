

public class SwitchStatement {
    public static void main(String args [] ) {
       int num  = 3;
       switch(num) {
        case 1 : System.out.println("Mango");
                break;
        case 2 : System.out.println("Banana");
                break;
        case 3 : System.out.println("Orange");
                break;
        case 4 : System.out.println("Kiwi");
                break;
        default : System.out.println("Just Dreaming and wake up");
       }
    }
}
//--------------------------- Using Switch Statement -------------------




// import java.util.*;
// public class SwitchStatement {
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
// ------------------------------- Calculator --------------------------