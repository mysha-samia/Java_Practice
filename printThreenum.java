import java.util.*;
import java.util.Scanner;
public class printThreenum {
    public static void main(String args[]){
       
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a= scn.nextInt();
        System.out.println("Enter value b:");
        int b= scn.nextInt();
        System.out.println("Enter value c:");
        int c= scn.nextInt();
       if(a>b && a>c){
        System.out.println("the largest value is a");
       }else if(b>c){
        System.out.println("the largest value is b");
       }else{
        System.out.println("the largest value is c");
       }
    }
}
