package JavaBasic.SelfPractice;

public class Exception_TryCatch {
    public static void main(String[] args) {

        int a= 0;
        int c=10;

        try {
            c=c/a;
        } catch (Exception e) {
            System.out.println("Arithmatic error");

        }
        System.out.println(c);
    }
}

