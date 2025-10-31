package JavaBasic.Task_23_Oct_Core_java_if_else_Program;

import java.util.Scanner;

public class Check_if_a_Number_is_an_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is armstrong or not? ");
        int number = sc.nextInt();
        double num = number;
        double sum=0;

        String S1 = ""+number;
        System.out.println("Entered string is - " + S1);
        int Power = S1.length();

        while (number!=0)
        {int digit =number%10;
            sum = sum+ Math.pow(digit,Power);
           /* System.out.println("sum is ---"+sum);*/
            number =number/10;
        }
        System.out.println("Total sum is -- "+sum);
        if (num==sum)
        {
            System.out.println("Number is an armstrong number");
        }
        else {
            System.out.println("Number is not an armstrong number");
        }

    }
}
