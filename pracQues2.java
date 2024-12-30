import java.util.Scanner;

public class pracQues2 {
    public static void main(String args[]){
        System.out.println("What is your current temparature?");
        Scanner scn = new Scanner(System.in);
        double temp = scn.nextDouble();
        String result =(temp>103.555)?"You have a fever":"you don't have any fever";
        System.out.println(result);
    }
}
