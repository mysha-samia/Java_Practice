import java.util.Scanner;

public class Functions {



    public static int Product(int a,int b){
     int multiply=a*b;
     return multiply;
    }
    public static int Factorial(int number){
    int factorial=1;
    for(int i=1;i<=number;i++){
       factorial=factorial*i;
    }
    return factorial;
    }
    public static int coEfficient(int number,int r){
      int n_fact=Factorial(number);
      int r_fact=Factorial(r);
      int nMr_fact=Factorial(number-r);

      int coEfficient_result = n_fact/(r_fact*nMr_fact);
      return coEfficient_result;

    }
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a= scn.nextInt();
        System.out.println("Enter the value of b");
        int b= scn.nextInt();
        int result=Product(a,b);
        System.out.println("The result is "+result);
        System.out.println("Enter any number ");
        int number= scn.nextInt();
        int Factorial_Result= Factorial(number);
        System.out.println("The result of the factorail is "+Factorial_Result);
        System.out.println("enter the value of r");
        int r=scn.nextInt();
       int coeffiecient_result= coEfficient(number,r);
       System.out.println("The Bionomial Coefficient Result is : " +coeffiecient_result);

      
    }
}
//coefficients in java

