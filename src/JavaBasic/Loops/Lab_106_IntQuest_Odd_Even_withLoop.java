package JavaBasic.Loops;

public class Lab_106_IntQuest_Odd_Even_withLoop {
    public static void main(String[] args) {
        int i=0;
        for (;i<=50; i++) {
            if(i%2==0){
                System.out.println(i +"  is Even number");
            }
            else System.out.println( i + "  is odd number");

        }
    }
}
