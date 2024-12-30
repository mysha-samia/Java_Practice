import java.util.Scanner;

public class oddEven {
    public static void main (String args[]){
        System.out.println("Enter the number please");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        if(num1%2==0){
         System.out.println(num1+" is a Even number");
        }else{
            System.out.println(num1+" is a odd number");
        }

    }
}
