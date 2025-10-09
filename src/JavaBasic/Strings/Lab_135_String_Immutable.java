package JavaBasic.Strings;

public class Lab_135_String_Immutable {
    public static void main(String[] args) {
        String name = "Satyam";
        name.toUpperCase();
        System.out.println(name);
        // program will print satyam (not SATYAM) as we have not assigned name.toUpperCase value yet
    }
}
