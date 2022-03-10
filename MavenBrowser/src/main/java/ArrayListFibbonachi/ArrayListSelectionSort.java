package ArrayListFibbonachi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSelectionSort {
    public static void selectionSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < numbers.size(); ++j) {
                if (numbers.get(j).compareTo(numbers.get(minPos)) < 0) {
                    minPos = j;
                }
            }
            int saveValue = numbers.get(minPos);
            numbers.set(minPos, numbers.get(i));
            numbers.set(i, saveValue);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList(Arrays.asList(3, 5, 1, 0));
        System.out.println(numbers);
        selectionSort(numbers);
        System.out.println(numbers);
    }
}
