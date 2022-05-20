package task1WorkingWithNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> finalList = new ArrayList<>();
        for (int s : intList) {
            if (s > 0 && s % 2 == 0) {
                finalList.add(s);
            }
        }
        Collections.sort(finalList);
        printList(finalList);
    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}


