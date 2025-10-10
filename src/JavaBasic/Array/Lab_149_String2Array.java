package JavaBasic.Array;

public class Lab_149_String2Array {
    public static void main(String[] args) {

        int[] Marks = {10,30,50,80,90,99};

        boolean[] is_married_people = {true, true, false};

        String name = "Satyam";
        String[] Conversion_into_Array = name.split("");
        for (String s: Conversion_into_Array) {
            System.out.println(s);
        }
        }

    }

