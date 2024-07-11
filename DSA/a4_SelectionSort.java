import java.util.*;

class a4_SelectionSort {
    public static void main(String args[]) {
        int arr[] = {5, 3, 4, 1, 2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int arr[]) {
        // Selection sort: find the max element and replace it with the last position
        for (int i = 0; i < arr.length; i++) {  
            int last = arr.length - 1 - i;
            // Find max element index in the unsorted portion of the array
            int maxIndex = maxIndexArray(arr, 0, last);
            // Swap the found max element with the last element of the unsorted portion
            swap(arr, maxIndex, last);
        }
    }

    // Function to find max element index in the range [start, end]
    static int maxIndexArray(int arr[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Function to swap elements at indices maxIndex and last
    static void swap(int arr[], int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
