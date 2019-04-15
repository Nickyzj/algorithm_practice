package ch08.sort.test;

import ch08.sort.Sort;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SortTest {

    private int[] arr = new int[10];

    @Before
    public void before() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%d, ", arr[i]));
        }
        System.out.println();
    }

    @Test
    public void selectSortTest() {
        Sort.selectSort(arr);
        printArr(arr);
    }

    @Test
    public void selectSort2Test() {
        Sort.selectSort2(arr);
        printArr(arr);
    }

    @Test
    public void insertSortTest() {
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = {4, 3, 2, 1};
        Sort.insertSort(arr);
        printArr(arr);
    }

    private void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%d, ", arr[i]));
        }
    }
}
