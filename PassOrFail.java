import java.util.Scanner;

public class PassOrFail{
    public static void main(String args[]){
        System.out.println("Enter your marks:");
        Scanner scn =new Scanner(System.in);
        float marks = scn.nextFloat();
        String result = (marks>=33)?"PASS":"FAIL";
        System.out.println("Your Result is:  " + result);
    }
}