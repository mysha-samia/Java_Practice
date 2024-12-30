import java.util.Scanner;

public class elseIf {
   public static void main(String args[]){
     System.out.println("Enter your age:");
     Scanner SCN = new Scanner(System.in);
     int age = SCN.nextInt();
     if(age>=18){
        System.out.println("You are a adult");
     }
     else if(age>=13 && age<18){
        System.out.println("You are a teenager");
     }
     else{
        System.out.println("You are a child");
     }
   } 
}
