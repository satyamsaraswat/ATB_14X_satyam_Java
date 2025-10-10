package JavaBasic.Array;
import java.util.*;
public class Array_Reverse {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr the size of array");
            int Size = sc.nextInt();

            String[] Marks =  new String[Size];

            for(int i=0;i<Marks.length;i++)
            {
                System.out.println("Enter the element");
                Marks[i]=sc.next();

            }
            System.out.println("-------- Print the array");
            for(String numb: Marks)
                System.out.println(numb);

            int[] Dummy = new int[Size];
            for(int j=0;j<Dummy.length;j++)
            {System.out.println("Enter elements for int array");
                Dummy[j] = sc.nextInt();
            }

            int Sum = 0;
            for(int i=Marks.length-1;i>=0;i--){
                Sum = Sum + Dummy[i];}
            System.out.println("Sum of the array is -- " +Sum);
        }
    }

