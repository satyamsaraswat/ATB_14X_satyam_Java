package JavaBasic.Function;

import java.util.Scanner;

public class Lab_134_question_Function_Arithmatic_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = check_num(sc, "Enter num1 ");

        int B =check_num(sc, "Enter num2 ");



        sum(A,B);
        sub(A,B);
        Mul(A,B);
        Div(A,B);

    }

    static void sum(int c, int d)
    {
        System.out.println(c+d);
    }
    static void sub(int e, int f)
    {
        System.out.println(e-f);
    }
    static void Mul(int a1, int a2)
    {
        System.out.println(a1*a2);
    }
    static void Div(int a3,int a4 )
    {
        System.out.println(a3/a4);
    }
    static int check_num(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {

            return sc.nextInt();
        } else {
            System.out.println("enter the integer only");
            System.exit(0);
            return  0;
        }
    }
}
