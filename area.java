import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("area of a circle");
        System.out.println("Enter the value of the radius");
        Scanner sc =new Scanner(System.in);
        float radius = sc.nextFloat();
        float PI =3.1416f;
        float area = PI * (float) (Math.pow(radius, 2));
        System.out.println("Area of a circle is" + area);


    
    }
}
