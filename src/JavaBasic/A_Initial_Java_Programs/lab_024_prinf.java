package JavaBasic.A_Initial_Java_Programs;

public class lab_024_prinf {
    public static void main(String[] args) {
        int number = 9;
        int count = 1;
        int mult = 1;
        System.out.println( "Table pf 9 without loop");
        // System.out.println("%d * %d = %d%n",a,b++,(c++*a));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));
        System.out.printf("%d * %d = %d%n", number, count++, (mult++*number));


        int a = 8;
        int b = 1;
        int c = 1;
        System.out.printf("%d * %d = %d%n", a, b++, (c++*a));
    }
}
