import java.util.*; 
public class cal { 
        public static void main(String args[]){ 
    Scanner ob = new Scanner(System.in); 
    int n1,n2,n3,ch;
    System.out.println("--Menu--\n1.ADD 2.SUB 3.MUL 4.DIV 5.EXIT\n Enter the Choice:"); 
    ch = ob.nextInt();
    if(ch>=1&&ch<=4) { 
    System.out.println("Enter 1st Number: "); 
    n1 = ob.nextInt(); 
    System.out.println("Enter 2nd Number: "); 
    n2 = ob.nextInt(); 
        switch (ch) { 
                case 1: 
                n3=n1+n2; 
                System.out.println("Addition = "+n3);  break;
                case 2: 
                n3=n1-n2; 
                    System.out.println("Subtraction = "+n3); break; 
                case 3: 
                n3=n1*n2; 
                    System.out.println("Multiplication = "+n3); break;
                case 4: 
                if (n2 != 0) {
                    n3 = n1 / n2; 
                    System.out.println("Division = " + n3); 
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                default: 
                    System.out.println(""); 
                } 
        } else if (ch==5)
        System.out.println("Exiting.....");
        else
        System.out.println("Invalid Input");
    ob.close();
 } 
}