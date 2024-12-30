import java.util.Scanner;
public class LargestThreeNum {
    public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter the numer 1:");
       int largest = scn.nextInt();
       
        for(int i=2; i<=10;i++){
            System.out.println("Enter the number" + i + ":");
            int num = scn.nextInt();
          if(num>largest){
            largest = num; 
          }
        }
        System.out.println("The largest num is:" + largest);
       

    }
}
