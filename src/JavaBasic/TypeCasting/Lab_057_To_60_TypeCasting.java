package JavaBasic.TypeCasting;

public class Lab_057_To_60_TypeCasting {
    public static void main(String[] args) {
        byte b = 44;

        int val = b;  // Widening TypeCasting // Implicit method

        int val1 = (int) b;  // WIdening TypeCasting // explicit method

        System.out.printf("value of Val1 is %d ",val1).println();
        System.out.printf("value of Val is %d ",val).println();

        long Max_limit = 984768930l;
        // short min_limit = Max_limit; --. Gives error Narrowing TypeCasting implicit method
        short minmin_limit = (short) Max_limit; // Gives error Narrowing TypeCasting explicit method

        System.out.println(minmin_limit);





    }
}
