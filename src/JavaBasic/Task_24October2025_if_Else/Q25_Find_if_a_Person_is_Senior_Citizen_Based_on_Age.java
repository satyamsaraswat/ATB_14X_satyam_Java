package JavaBasic.Task_24October2025_if_Else;

import java.util.Scanner;

public class Q25_Find_if_a_Person_is_Senior_Citizen_Based_on_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
    if (age>=0) {
        if (age == 0 && age <= 12) {
            System.out.println("entered age is of child");
        } else if (age == 13 && age <= 19) {
            System.out.println("entered age is of Teenager");
        } else if (age == 20 && age <= 64) {
            System.out.println("entered age is of Adult");
        } else if (age >= 65) {
            System.out.println("entered age is of senior citizen");
        }
    } else
    {
        System.out.println("Please enter the correct age");
    }

    }
}
