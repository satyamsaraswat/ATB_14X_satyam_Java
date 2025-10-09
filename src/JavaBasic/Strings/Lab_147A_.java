package JavaBasic.Strings;

public class Lab_147A_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); // dlroW olleH
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println(sb1);

        sb1.replace(0, 4, "C++");
        System.out.println(sb1);
    }
}
