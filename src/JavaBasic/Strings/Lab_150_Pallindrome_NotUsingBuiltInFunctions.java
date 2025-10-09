package JavaBasic.Strings;

import java.util.*;

public class Lab_150_Pallindrome_NotUsingBuiltInFunctions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Str1 = sc.nextLine();
        String ReverseString = "";

        for(int i = Str1.length()-1; i>=0;i--)
        {ReverseString  =  ReverseString + Str1.charAt(i)  ;
        }

        if(Str1.equalsIgnoreCase(ReverseString))
        {System.out.println("Entered String is pallindrome");
        }
        else
            System.out.println("Not a pallindrome");


    }

}
