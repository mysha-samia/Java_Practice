import java.util.Scanner;

public class whileLoop {
    public static void main(String args[]){
        System.out.println("Enter the value n");
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int counter =1;
        int sum =0;

        while(counter<=n){
            sum = sum + counter;
            counter=counter+1;
         
        }
        System.out.println(sum);
    }
}
