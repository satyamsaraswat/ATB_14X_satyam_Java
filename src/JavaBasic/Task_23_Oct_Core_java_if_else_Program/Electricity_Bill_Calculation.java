package JavaBasic.Task_23_Oct_Core_java_if_else_Program;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
       /*GIven  :- take the input from the user of Units.
                Implement Rate Structure:
        Define the rate structure for calculating the bill based on the number of units consumed.
        :-  First 100 units: 0.50Rs per unit
        :-  Next 100 units (101-200): 0.75Rs per unit
        :- Next 100 units (201-300): 1.20Rs per unit
        :- Above 300 units: 1.50Rs per unit*/
        Scanner sc = new Scanner(System.in);
        float Consumed_units = sc.nextFloat();
        float Electricity_bill =0.0F;


        if (Consumed_units<0)
        {
            System.out.println("Enter the correct number, number cannot be negative");
        } else if (Consumed_units<=100.0)
        {
            Electricity_bill = (float) (Consumed_units * 0.50);
            System.out.println("Electricity bill is Rs:  "+ Electricity_bill);
        } else if (100.00<Consumed_units || Consumed_units<=200.00) {

            Electricity_bill = (float) (Consumed_units * 0.75);
            System.out.println("Electricity bill is Rs:  "+ Electricity_bill);
        } else if (200.00<Consumed_units || Consumed_units<=300.00) {

            Electricity_bill = (float) (Consumed_units * 1.20);
            System.out.println("Electricity bill is Rs:  "+ Electricity_bill);
        }else
        {
            Electricity_bill = (float) (Consumed_units * 1.50);
            System.out.println("Electricity bill is Rs:  "+ Electricity_bill);
        }

    }

}

