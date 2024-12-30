import java.util.Scanner;

public class ques3 {
    public static void main(String args[]){
        //leap year or not
        System.out.println("Enter the year:");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year%4!=0){
            System.out.println("This "+year+" is not a leap Year");
        }else if(year%4 ==0 && year%100!=0){
            System.out.println("This "+year+" is a leap Year");
        }else if(year%4 ==0 && year%100==0 && year%400==0){
            System.out.println("This "+year+" is a leap Year");
        }else{
            System.out.println("This "+year+" is not  a leap Year");
        }
        
    }
}
