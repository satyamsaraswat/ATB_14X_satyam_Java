package JavaBasic.TernaryOperators;

public class TernaryOperatorsQ3_Age_Classification {
    public static void main(String[] args) {
        int age =59;
        String Age_Class = (age>18)?((age>60)?"Senior Citizen":"Adult"):"Minor";
        System.out.println(Age_Class);

        int a1 = 40;
        int b = 50;
        int c = 10;
        int max_Nummber= (a1>b)?((a1>c)?a1:c):(b>c)?b:c;
        System.out.println(max_Nummber);


    }
}
