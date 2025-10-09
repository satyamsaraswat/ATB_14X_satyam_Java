package JavaBasic.Strings;

import java.util.*;

public class Lab_151_ReverseString_without_BuiltInFUnction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Str1 = sc.nextLine();

        String ReverseArray = "";
        char[] inputArray = Str1.toCharArray();
        for (int i = inputArray.length-1; i >= 0; i--) {
            ReverseArray = ReverseArray + inputArray[i];
        }
        System.out.println("Reversed string is  " + ReverseArray );

        /*if (ReverseArray.equalsIgnoreCase(Str1)) {
            System.out.println("ENetered STring is pallindrome");

        } else System.out.println("Nota pallindrome");*/
    }
}
