package JavaBasic.Task_Oct_26_Programs_.ForLoop;

public class TableoOf5 {
    public static void main(String[] args)
    {
        int N = 5;

        // Multiplication table of 5 by user input
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d= %d",N,i,N*i).println();
        }

        /*int N = 5;

        // Multiplication table of 5
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }*/
    }
}