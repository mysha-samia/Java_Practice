import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();//conversion 6
        System.out.println(num);// 6.0
        float num2 =25.2345f;
        int num3 = (int) num2; //force casting
        System.out.println(num2);//25.2345
        System.out.println(num3); //25

    }
}
