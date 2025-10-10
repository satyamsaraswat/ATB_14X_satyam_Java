package JavaBasic.Array;
import java.util.*;
public class Print_secondHighest_Number {

        public static void main(String[] args) {
            int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
            Arrays.sort(numbers);
            //for(i=0;i<numbers.length)
            System.out.println(numbers[numbers.length-2]);
        }
    }

