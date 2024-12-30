
    import java.util.Scanner;
    
    public class javaInputs {
        public static void main(String[] args) {
            System.out.println("write the inputs");
            // To take the input
            Scanner sc = new Scanner(System.in);
            int num1=sc.nextInt();
            System.out.println( "num1 "+ num1);
            
            float num2=sc.nextFloat();
            System.out.println("num2 "+ num2);
            
            boolean num3 = sc.nextBoolean();
            System.out.println("num3 " + num3);
            
            // Your code here
        }
    }

