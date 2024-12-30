import java.util.Scanner;

public class practiceQues1 {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
       float num = scn.nextFloat();
       if(num>0){
        System.out.println("num is positve");
       }else if(num<0){
        System.out.println("num is negative");
       }else{
        System.out.println("num is 0");
       }
    }
}
