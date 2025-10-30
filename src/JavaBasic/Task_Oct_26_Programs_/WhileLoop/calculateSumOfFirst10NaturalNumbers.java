package JavaBasic.Task_Oct_26_Programs_.WhileLoop;

import java.util.Scanner;

public class calculateSumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of natural number");
        int Number = sc.nextInt();
        int Sum= 0;

        if(Number==0 || Number<0)
        {
            System.out.println("Number is not a natural number. Kindly enter the number starting from 1");
        }
        else
        {
            int i=1;
            while (i<=Number)
            {
                Sum = Sum+i;
                i++;
            }
            System.out.println("Sum of natural numbers is :   "  + Sum);
        }
    }


}
