package JavaBasic.Strings;
import java.util.*;

public class Lab_149_Pallindrome_BuitInFunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Str1 = sc.nextLine();


        StringBuilder sb = new StringBuilder(Str1);
        String ReverseString = sb.reverse().toString();
        System.out.println("ReverseString is - "+ReverseString);

        if(Str1.equalsIgnoreCase(ReverseString))
        {System.out.println("Entered String is pallindrome");
        }
        else
            System.out.println("Not a pallindrome");

    }
    }

