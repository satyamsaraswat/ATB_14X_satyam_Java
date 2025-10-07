package JavaBasic.TypeCasting;

public class Lab_056_TypeCasting {
    public static void main(String[] args) {
        int a = 300;
       //  byte b = a;   --- Here type casting will not take place as a is
        //  integer which contains larger value then byte b.
        byte b = (byte) a; // Narrowing Type casting as int is bigger to byte smaller.
        // --- Here type casting will take place as a is  integer which contains larger value then byte b.
        System.out.println(b);

    }

}
