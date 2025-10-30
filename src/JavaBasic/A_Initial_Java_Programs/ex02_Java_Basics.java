package JavaBasic.A_Initial_Java_Programs;

public class ex02_Java_Basics {
    public static void main(String[] args) {
        long num = 123L;
        if(num > 123)
        { System.out.println("TIGER"); }
        else
        { System.out.println("BIRD"); }

        int a = 5, b = 10;
        if(a > 0)
            if(b > 5)
                System.out.print("X");
        else
            System.out.print("Y");

        int x = 2;
        if(x == 2)
            if(x > 0)
                if(x < 5)
                    System.out.print("Nested");
    }

    /* Author : Satyam Saraswat

     */
}
