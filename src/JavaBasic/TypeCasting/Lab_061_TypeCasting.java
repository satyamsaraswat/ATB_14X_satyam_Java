package JavaBasic.TypeCasting;

public class Lab_061_TypeCasting {
    public static void main(String[] args) {
        int val = 300;
        float Gst = 50.5f;

       // int total = val+ Gst; // gives error.
// Note: - int & flat has same bit/byte size of 64 bit & 8 byte. but flat has wider ranger than int.
        int total1 = val + (int) Gst; //  Narrowing Typecasting - explicit
        float total2 = Gst + val;// Widening Typecasting - Implicit

        System.out.println(total1);
        System.out.println(total2);


    }

}
