package JavaBasic.IfElse_Switch_;

import java.util.Scanner;

public class Ifelse_UserInput {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter user name");
        String name = user_input.nextLine(); // String input
        System.out.println(name);

        System.out.println("Enter user age");
        String age = user_input.nextLine();
        System.out.println("String age is " + age);
        int age1 = Integer.parseInt(age);
        System.out.println("integer age is " + age1);

        if ((age1 > 10) && (name == "satyam")) {
            System.out.println("hoho");
        } else if ((age1 <= 10) || (name == "satyam")) {
            System.out.println("hihi");
        } else {
            System.out.println("hihehioisi");
        }

    }


    }

