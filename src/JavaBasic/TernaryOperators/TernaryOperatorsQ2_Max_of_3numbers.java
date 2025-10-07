package JavaBasic.TernaryOperators;

public class TernaryOperatorsQ2_Max_of_3numbers {
    public static void main(String[] args) {
        int n1= 21;
        int n2 =9;
        int n3 = -11;

        int Max_number = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("Maximum Number is  " +Max_number );
    }
}
