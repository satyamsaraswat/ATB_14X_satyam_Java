package JavaBasic.Loops;

import java.util.Scanner;

public class Lab_109_CalculateFactorial_of_a_number {
    public static void main(String[] args) {
        System.out.println("enter the number of your choice");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial =1;
        if (number==0){
            System.out.println("Factorial is 1");
        }
        else {
            for (int i = 0; i <number ; i++) {

                factorial  +=factorial*i;

            }
            System.out.println("fcatorial of given number is  "+ factorial);
        }
    }
}
