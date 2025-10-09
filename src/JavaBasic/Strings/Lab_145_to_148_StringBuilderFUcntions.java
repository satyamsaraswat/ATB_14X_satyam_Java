package JavaBasic.Strings;
import java.util.*;

public class Lab_145_to_148_StringBuilderFUcntions {

    /*// 1. Reverse by String Builder & String Bufffer
    2. Append by String Buffer
    3. Append by String Builder
    */

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
//

        public static void main(String[] args) {
 /*// 1. Reverse by String Builder & String Bufffer
    2. Append by String Buffer
    3. Append by String Builder
    */

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String1");
            String String1 = sc.next();
            System.out.println("Enter the String2");
            String String2 = sc.next();

            //1- Reverse string by StringBuilder

            StringBuilder str = new StringBuilder(String1);
            String ReverseString_by_StringBuilder = str.reverse().toString();
            // toString is written because StringBuilder is not compatible with String.
            System.out.println("ReverseString_by_StringBuilder  is   --"+ ReverseString_by_StringBuilder);
            // 3. Append by String Builder
            System.out.println("String2 after append by String1 Builder is -- "+ str.append("Sdffffffffftring1"));

            StringBuffer StrBuff = new StringBuffer(String2);
            System.out.println("Reverse of string by String buffer is   --  " + StrBuff.reverse());

            //  2. Append by String Buffer
            System.out.println(StrBuff.append("String2khjh"));


        }
    }

