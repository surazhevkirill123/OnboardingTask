package ArrayListFibbonachi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBubbleSort {
    public static void BubbleSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int tempVar = numbers.get(j + 1);
                    numbers.set(j + 1, numbers.get(j));
                    numbers.set(j, tempVar);
                }
            }
        }
    }

    public static void main(String[]args){
        List<Integer> numbers= new ArrayList(Arrays.asList(3, 5, 1, 0));
        System.out.println(numbers);
        BubbleSort(numbers);
        System.out.println(numbers);
    }
}
