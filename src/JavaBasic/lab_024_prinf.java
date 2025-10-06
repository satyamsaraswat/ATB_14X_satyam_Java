package JavaBasic;

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


        int aask = 8;
        int baask = 1;
        int caask = 1;
        System.out.println("%d * %d = %d%n", aask, baask++, (aask*caask++));

    }
}
