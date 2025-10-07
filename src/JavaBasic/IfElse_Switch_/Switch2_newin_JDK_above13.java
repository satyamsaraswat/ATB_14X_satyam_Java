package JavaBasic.IfElse_Switch_;

import java.util.Scanner;

public class Switch2_newin_JDK_above13 {
    public static void main(String[] args) {
        System.out.println("enter the day name");
        Scanner sc = new Scanner(System.in);
        String day_name = sc.next();
        System.out.println("entered day is "+day_name);
        System.out.println("enter day number between 1 to 10");
        int day_number = sc.nextInt();
        System.out.println("entered day number is "+day_number);

        if(1<=day_number && day_number<=10)
        /*{
            switch (day_number) {
                case 1, 8, 9:
                    System.out.println("Monday");
                    break;
                case 2, 3, 4:
                    System.out.println("Tuesday");
                    break;
            }*/

        {switch (day_number)
{
                case 5 -> System.out.println("Wednesday");
                case 6 -> System.out.println("Thursday");
                case 7 -> System.out.println("Friday");
            }
        }
        else {
            System.out.println("You are a fool I asked you to enter between 1 to 7");
        }
    }
}
