package JavaBasic.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab_153_IQ_MaxMin_Number_Array {
    public static void main(String[] args) {
        int numbers[] = {80, 90, 45, 200, 40, 40, 70};

        // Sorting using in Built Functions

        Arrays.sort(numbers);
        System.out.println("Maximum number in array is - " + numbers[numbers.length - 1]);
        System.out.println("Minimum number in array is - " + numbers[0]);

        // Sorting of array without in built functions

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is " +max);
    }


    }

