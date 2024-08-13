import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int ch;
        int[] ar1 = new int[4];
        int[] ar2 = new int[4];
        int[] ar3 = new int[4];
        do {
            System.out.println("--Menu--\n1.ADD 2.SUB 3.MUL 4.DIV 5.EXIT\nEnter your choice:");
            ch = ob.nextInt();
            if (ch >= 1 && ch <= 4) {
                System.out.println("Enter the elements for array 1:");
                for (int i = 0; i < 4; i++) {
                    ar1[i] = ob.nextInt();
                }
                System.out.println("Enter the elements for array 2:");
                for (int i = 0; i < 4; i++) {
                    ar2[i] = ob.nextInt();
                }
            }
            switch (ch) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        ar3[i] = ar1[i] + ar2[i];
                    }
                    System.out.println("Addition of arrays:");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(ar3[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i < 4; i++) {
                        ar3[i] = ar1[i] - ar2[i];
                    }
                    System.out.println("Subtraction of arrays:");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(ar3[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        ar3[i] = ar1[i] * ar2[i];
                    }
                    System.out.println("Multiplication of arrays:");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(ar3[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    for (int i = 0; i < 4; i++) {
                        if (ar2[i] != 0) {
                            ar3[i] = ar1[i] / ar2[i];
                        } else {
                            System.out.println("Error: Division by zero at index " + i);
                            ar3[i] = 0;
                        }
                    }
                    System.out.println("Division of arrays:");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(ar3[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (ch != 5);
        ob.close();
    }
}