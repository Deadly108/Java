import java.util.Scanner; 
public class scan{ 
    public static void main(String[] args) { 
        try (Scanner ob = new Scanner(System.in)) { 
            int age; 
            long prn; 
            float cgpa; 
            System.out.print("Enter age: "); 
            age = ob.nextInt(); 
            ob.nextLine();
            System.out.print("Enter name: "); 
            String name = ob.nextLine(); 
            System.out.print("Enter PRN: "); 
            prn = ob.nextLong(); 
            System.out.print("Enter CGPA: "); 
            cgpa = ob.nextFloat(); 
            System.out.println("\n**Details**"); 
            System.out.printf("Student Name: %s%nStudent Age: %d%nPRN: %d%nCGPA: %.2f%n", name, age, prn, cgpa); 
        } 
    } 
}
