package JavaBasic.Task_24October2025_if_Else;

import java. util.Scanner;

public class Q23_Convert_Days_into_Years_Months_and_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days which you want to convert");
        int Number = sc.nextInt();
        int Y ;
        int M ;
        int D;
        int Z;
        System.out.println("Please select the number from given options");
        System.out.println(" Option 1 : TO convert Days into Years only");
        System.out.println(" Option 2 : TO convert Days into Months ony");
        System.out.println(" Option 3 : TO convert Days into Years & months & days " );
        System.out.println(" Option 4 : Exit");
        int Choice = sc.nextInt();


        if (Number<=0 )
        {
            System.out.println(" Please Enter the positive number");
        }
        else {

            switch (Choice) {
                case 1:
                    Y = Number / 365;
                    Z = Number % 365;
                    System.out.println("Print Y" + Y);
                    System.out.println("Print Z" + Z);
                    System.out.printf("after conversion into years only is %d.%d", Y, Z);
                    break;
                case 2:
                    Y = Number / 30;
                    Z = Number % 30;
                    System.out.println("Print Y" + Y);
                    System.out.println("Print Z" + Z);
                    System.out.printf("after conversion into months only is %d.%d", Y, Z);
                    break;

                case 3:
                    Y = Number / 365;
                    int A = Number - (Y * 365);
                    Z = A / 30;
                    D = Number - (Y * 365) - (Z * 30);

                    /*System.out.println("Print Y" + Y);
                    System.out.println("Print Z" + Z);*/
                    System.out.printf("after conversion 1000 days   is equals to  %d years %d months %d days", Y, Z, D);
                    break;

                case 4:
                    System.out.println(" Exit ");
            }
        }

    }
}
