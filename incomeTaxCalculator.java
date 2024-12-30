import java.util.Scanner;

public class incomeTaxCalculator{
    public static void main(String args[]){
        System.out.println("Enter your income:");
        Scanner scn = new Scanner (System.in);
        int income = scn.nextInt();
        double tax;
        double afterTaxIncome;
        if (income < 500000){
            tax=0;
            System.out.println("No tax added");
        }else if (income >= 500000 && income < 1000000){
            //we can do type casting like this
            //tax= (int) (income*(0.2))
            tax= income*(0.2);
            afterTaxIncome= income-tax;
            System.out.println("You have to pay the tax " + tax);
            System.out.println("After tax your income would be " +  afterTaxIncome);
        }else{
            tax =income*(0.3);
            afterTaxIncome= income-tax;
            System.out.println("After tax your income would be " +  afterTaxIncome);
        }

    }
}