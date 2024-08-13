import java.util.Scanner;
public class strin { 
    public static void main(String[] args) { 
        Scanner ob = new Scanner(System.in); 
        String lastname = " Patole"; 
        String midname = "Milind"; 
        int a = 10; 
        System.out.println("Enter the name with Space at start and end:");
        String Name = ob.nextLine(); 
        System.out.println("Original name: " + Name + " String length: " + Name.length()); 
        boolean isEmpty = Name.isEmpty(); 
        System.out.println("Name is empty: " + isEmpty); 
        String name = Name.trim(); 
        System.out.println("After trim: " + name + " String length after trim: " + name.length()); 
        System.out.println("Check equality: " + Name.equals(name)); 
        String opname = name.toLowerCase(); 
        System.out.println("String to Lowercase: " + opname); 
        opname = name.toUpperCase(); 
        System.out.println("String to Uppercase: " + opname); 
        opname = name.concat(lastname); 
        System.out.println("After concatenation: " + opname); 
        String substring = name.substring(1, 4); 
        System.out.println("Substring of name from index 1 to 4: " + substring); 
        char charAt2 = name.charAt(2); 
        System.out.println("Character at index 2 in name: " + charAt2); 
        boolean equalsIgnoreCase = name.equalsIgnoreCase(lastname); 
        System.out.println("Name equals lastname (ignore case): " + equalsIgnoreCase); 
        int compareTo = name.compareTo(lastname); 
        System.out.println("Comparing name and lastname: " + compareTo); 
        String replaced = lastname.replace('P', 'p'); 
        System.out.println("Replace 'P' with 'p' in lastname: " + replaced); 
        int indexOfL = lastname.indexOf('a'); 
        System.out.println("First index of 'a' in lastname: " + indexOfL); 
        int lastIndexOfL = lastname.lastIndexOf('a'); 
        System.out.println("Last index of 'a' in lastname: " + lastIndexOfL); 
        char[] charArray = name.toCharArray(); 
        System.out.println("Char array of name: "); 
        for (char c : charArray) { 
            System.out.println(c); 
        } 
        boolean startsWithHe = lastname.startsWith("Pa"); 
        System.out.println("lastname starts with 'Pa': " + startsWithHe); 
        String joinedString = String.join(", ", lastname, name, midname); 
        System.out.println("Joined string: " + joinedString); 
        String internedString = name.intern(); 
        System.out.println("Interned string of name: " + internedString); 
        char[] destArray = new char[5]; 
        name.getChars(0, 5, destArray, 0); 
        System.out.println("Chars from name copied to destArray: "); 
        for (char c : destArray) { 
            System.out.println(c); 
        } 
        String s = String.valueOf(a); 
        System.out.println(s + 10); 
        ob.close(); 
    } 
}