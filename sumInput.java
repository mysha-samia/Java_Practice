import java.util.Scanner;

public class sumInput {
    public static void main(String[] args) {
        System.out.println("Give me the input of a");
        Scanner scA =new Scanner(System.in);
        int a= scA.nextInt();
        System.out.println("Give me the input of b");
        Scanner scB =new Scanner(System.in);
        float b = scB.nextFloat();
        System.out.println("Value of the two inputs are   " + a + "&  " + b);
       float sum = a+b;
        System.out.println("Sum of the inputs is "+sum);
       
    }
}
