package JavaBasic.Task_24October2025_if_Else;

import java.util.Scanner;

public class Q22_Check_if_a_Number_is_Divisible_by_5_and_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is divisible by 5 & 11 :");
        int Number  = sc.nextInt();

        if (Number%5==0 && Number%11==0)
        {
            System.out.println("Number is divisble by both 5 & 11");
        }
        else if (Number%5==0 && Number%11!=0) {
            System.out.println("Number is divisible by  5  only ");
        } else if (Number%11==0 && Number%5!=0) {
            System.out.println("Number is divisible by  11  only ");
        }
        else {
            System.out.println("Number is neither divisible by 5 nor by 11");
        }
    }
}
