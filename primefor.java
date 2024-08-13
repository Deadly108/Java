import java.util.*; 
public class primefor { 
    public static void main(String[] args) { 
        Scanner ob = new Scanner(System.in); 
        int i, flag = 0; 
        System.out.println("Enter the Number: "); 
        int n = ob.nextInt(); 
        if (n==0||n==1) { 
            System.out.println(n + " is not a prime number"); 
        } else { 
            int sqrt=(int) Math.sqrt(n);
            for (i=2;i<=sqrt;i++) { 
                if (n%i==0) { 
                    System.out.println(n + " is not a prime number"); 
                    flag = 1; 
                    break; 
                } 
            } 
            if (flag==0) { 
                System.out.println(n + " is a prime number"); 
            } 
        } 
        ob.close(); 
    } 
}