package ArrayListFibbonachi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static int getFibonacciValue(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList(Arrays.asList(3, 5, 8, 13, 20));
        for (Integer number : numbers) {
            System.out.println(number + " - ое число Фиббоначчи: " + getFibonacciValue(number));
        }
    }
}
