package JavaBasic.Task_Oct_26_Programs_.ForLoop;

import java.util.Scanner;

public class SumofFirst_10_NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the highest natural number you want to enter");
        int Sum = 0;
        Scanner sc = new Scanner(System.in);
        int sc_input = sc.nextInt();

        if (sc_input <= 0) {
            System.out.println("Entered number is not a natural number");
        }
        else {
            for (int i = 1; i <= sc_input; i++) {
                Sum = Sum + i;
            }
        }
        System.out.println("sum of natural numbers is:  " + Sum);
    }
}