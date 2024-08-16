package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        getSum(new int[] {10}, 10);
    }
    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        int index = -1;
        OptionalInt foundNumber = Arrays.stream(values)
                .filter(value -> value == startValue)
                .findFirst();

        try{
           index = Arrays.stream(values).boxed().toList().indexOf(foundNumber.getAsInt());
        }catch (NoSuchElementException e){
            sum = 0;
            System.out.println(sum);
            return sum;
        }

        for (int i = 0; i < values.length; i++) {
            if(i > index){
                sum+= values[i];
            }else sum = 0;
        }
        System.out.println(sum);
        return sum;
    }
}