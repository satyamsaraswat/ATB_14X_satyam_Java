package JavaBasic.Array;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab_154_arrayInputBy_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int Size = sc.nextInt();

String Marks[] = new String[Size];

        for (int i=0;i<Marks.length;i++){
            System.out.println("Enter the element ---> "+i);
        Marks[i] = sc.next();}

    }
}
