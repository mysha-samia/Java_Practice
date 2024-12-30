import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        System.out.println("Product of a & b");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the input of a");
        float a= sc.nextFloat();
        System.out.println("Give me the input of b");
        float b = sc.nextFloat();
        float product = a*b;
        System.out.println("The product of a & b is " + product);

    }
}
