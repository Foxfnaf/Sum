package org.example;

public class Main {
    public static void main(String[] args) {
        getSum(new int[] {1, 2, 3}, 1);
    }

public static int getSum(int[] values, int startValue) {
    boolean found = false;
    int result = 0;
    for (int value : values) {
        if (found) result += value;
        else if (value == startValue) found = true;
    }
    System.out.println(result);
    return result;
}
}