import java.util.Scanner;

public class printLaargestNum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first value: ");
        int str1 = scn.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second value: ");
        int str2 = scn.nextInt();

        // Compare and print the largest number
        if (str1 > str2) {
            System.out.println("The largest number is: " + str1);
        } else if (str2 > str1) {
            System.out.println("The largest number is: " + str2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner
        scn.close();
    }
}

