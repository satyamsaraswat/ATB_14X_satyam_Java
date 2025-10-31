package JavaBasic.Task_23_Oct_Core_java_if_else_Program;

import java.util.Scanner;

public class Calculate_Bonus_Based_on_Salary_and_Years_of_Experience {
    public static void main(String[] args) {
        /*GIven: - :- take the salary and Year info from the User.
        Implement Bonus Calculation Logic:
        Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Years of experience ");
        float exp = sc.nextFloat();
        System.out.println("Enter the Salary  ");
        double Sal = sc.nextFloat();
        double Bonus;
        if (exp<1.0)
        {
            System.out.println("No bonus for experience less than 1 year");
        } else if (exp>1.0 && exp<=3.0 ) {
            Bonus = 0.05* Sal;
            System.out.println("Bonus is 5 % of the salary :"+ Bonus);
        } else if (exp>3.0 && exp<=6.0 ) {
            Bonus = 0.10* Sal;
            System.out.println("Bonus is 10% of the salary: "+ Bonus);
        } else
        { Bonus = 0.15*Sal;
            System.out.println("BOnus is 15% of the salary: " + Bonus);
        }


    }
}
