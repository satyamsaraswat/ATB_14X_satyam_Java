package JavaBasic.Task_Oct_26_Programs_.WhileLoop;

import java.util.Scanner;

public class PrintNumbers1to10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the series: -  ");
        int Num_Input = sc.nextInt();

        int i =1;

        while (i<=Num_Input) {
            System.out.println(i);
            i++;
        }
    }

    /*
    for(i=1; i<=n;i++)
    { sout(i);

    }
    * */


}
