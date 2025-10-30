package JavaBasic.Task_Oct_26_Programs_.WhileLoop;

import java.util.Scanner;

public class EvenNumbers1to20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print event number");
        int Number = sc.nextInt();

        if (Number%2==0) {
            int i=0;
            while (i<=Number)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Entered number is not a even number");
        }
    }
}
