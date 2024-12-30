import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
       
        int rev=0;
        while(num>0){
        int lastDigit= num%10;
        rev=(rev*10)+lastDigit;
        num=num/10;

        }
        System.out.println("The reverse of the entered number is "+rev);

    }
}
