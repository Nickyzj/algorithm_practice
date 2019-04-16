package ch08.sort;

public class MyQuickSort {

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int temp;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        MyQuickSort ob = new MyQuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
