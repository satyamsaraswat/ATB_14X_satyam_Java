package JavaBasic;

public class Lab_044_to__49Operators {
    public static void main(String[] args) {
        System.out.println(!(10>20));
        System.out.println(10>20);

        int balaji_salary = 12;
        System.out.println(!(balaji_salary>10||balaji_salary<5));

        int a =10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);

        //compound assignment operators

        int age =10;

        age +=10;
        age -=10;
        age /=10;
        System.out.println(age);

    }
}
