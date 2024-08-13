import java.util.Scanner;
public class jagged { 
 public static void main(String[] args) {
 try (Scanner ob = new Scanner(System.in)) {
    System.out.println("enter the no of row of Array:"); 
     int size = ob.nextInt(); 
     int [][]arr= new int[size][]; 
     int i,j; 
     for(i=0 ; i<size; i++) 
     { 
     System.out.println("Enter the no of Elements for arr:"+(i+1)); 
     int count = ob.nextInt(); 
     arr[i]=new int[count]; 
     System.out.println("Enter the Variables:"); 
     for(j=0;j<count;j++) 
     { 
     arr[i][j] = ob.nextInt(); 
     } 
     System.out.print("\n"); 
     } 
     System.out.println("Given jagged Array:"); 
     for(i=0 ; i<arr.length ; i++) 
     { 
     for(j=0;j<arr[i].length;j++) 
     { 
     System.out.print(arr[i][j]+" "); 
     } 
     System.out.print("\n"); 
     }
} 
 } 
}