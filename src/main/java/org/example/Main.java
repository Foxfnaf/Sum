package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {1};
        int startValue = 0;

        getSum(new int[]{1, 2, 3}, 1);
    }
    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        if (Arrays.stream(values).anyMatch(value -> value == startValue)) {
            for (int i = 0; i < values.length; i++) {
               if(values[i] > startValue) {
                   sum += values[i];
               }
            }
        }else sum = 0;
        System.out.println(sum);

        return sum;
    }
}