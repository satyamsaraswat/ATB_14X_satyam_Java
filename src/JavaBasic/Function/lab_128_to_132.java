package JavaBasic.Function;

import java.util.Scanner;

public class lab_128_to_132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers A");

        int n1 = sc.nextInt();
        System.out.println("enter numbers B");
        int n2 = sc.nextInt();


        sum1(); // first function call
        sum2(4,8);
        String sampleSum3 = sum3();
        System.out.println(sampleSum3);

        int sum_is = sum_of_2_number(n1,n2);
        System.out.println(sum_is);

    }

    //1. Function without return type & without parameters

    static void sum1()
    {
        int a= 5;
        int b=10;
        System.out.println(a+b);
    }
    //2. Function without return type & with parameters
    static void sum2(int c, int d)
    {
        System.out.println("Spread happiness");
        System.out.println(c+d);

    }


    //3. Function with return type & without parameters
    static String sum3()
    {
        return "default String";

    }


    //4. Function with return type & with parameters
static int sum_of_2_number(int a, int b)
{
    return a+b;
}

}
