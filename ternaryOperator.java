import java.util.Scanner;

public class ternaryOperator {
    public static void main(String args[]){
        //variable=condition?statement1:statement2;
        System.out.println("Enter the value");
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();
        String Type = (num %2==0) ?"even" : "odd";
        System.out.println(Type);
    }
}
