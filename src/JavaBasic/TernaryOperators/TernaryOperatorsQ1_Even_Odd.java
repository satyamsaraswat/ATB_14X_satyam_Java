package JavaBasic.TernaryOperators;

public class TernaryOperatorsQ1_Even_Odd {
    public static void main(String[] args) {
        int a = 20;

        String result = ((a%2==0 )? "even":"odd");
         // condition1 ? condition2
        System.out.println("The number is "+ result);
    }
}
