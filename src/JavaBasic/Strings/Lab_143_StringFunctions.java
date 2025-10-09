package JavaBasic.Strings;

public class Lab_143_StringFunctions
{

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//String functions : -  print length, String to char conversion, concatenation, contains string function, equals, equalignore case, print index, replace, substring, lowercase, startswith, ends with , compare to
//import java.util.*;

    public static void main(String[] args) {
        String name = "Satyam With Package of 25 Lakhs";
        String name1 = "  piKa CHU        ";


        String str1 = new String("        Pikachuz izagzaggoon    ");
        // 1- priting length of string

        System.out.println(name.length());
        System.out.println(name1.length());
        System.out.println(str1.length());

        // 2- String to char conversion & print them

        char[] DummyArray = name1.toCharArray();

        System.out.println("COnverted char Array is " + DummyArray);

        for(int i=0;i<name1.length();i++)
        { char Dummy1 = name1.charAt(i);
            System.out.println(Dummy1);
        }

        //2A - String to byte conversion & print them
        byte[] DummyByte = str1.getBytes();
        System.out.println(DummyByte);

        for(byte b: DummyByte){
            System.out.println(b);}


        //3- concatenation,
        System.out.println(name.concat(str1));

        //4-  contains string function,

        System.out.println(name.contains("yam"));

        //5-equals-
        System.out.println(name.equals(str1));
        System.out.println(name1.equals("Pikachu"));
        //6- equalignore case,

        System.out.println(name1.equalsIgnoreCase("Pikachu"));

        //7- print index,
        System.out.println(name.indexOf("2"));

        //8 - replace
        System.out.println(name.replace("Lakhs", "Crores"));


        //9- substring,
        System.out.println(name.substring(1,3));

        //10- lowercase, startswith,
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //11- ends with
        System.out.println(name.endsWith("m"));
        //12-compare to
        System.out.println(name.compareTo("Makhna"));

        // 13- trim
        System.out.println(str1.trim());
    }
}