import java.util.Scanner; 
class Cla
{ 
    void fact(int n) 
    { 
        int fact = 1; 
        for(int i = 1; i <= n; i++) 
        { 
            fact = fact * i; 
        } 
        System.out.println("Factorial is " + fact); 
    } 

    public static void main(String args[]) 
    { 
        int n; 
        Scanner ob1 = new Scanner(System.in); 
        System.out.println("Enter the number:"); 
        n = ob1.nextInt(); 
        Cla ob = new Cla(); 
        ob.fact(n); 
        ob1.close(); 
    } 
}
