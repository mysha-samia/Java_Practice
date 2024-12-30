import java.util.Scanner;

public class javaInput {
    public static  void main(String args[]){
        //to take the input
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the input");
        String input = sc.next();
        System.out.println(input);
        String name = sc.nextLine();
         //for storing the spacer too
         System.out.println(name);
    }
    
}
