package sorting;

import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void test_sortSmallArray() {
        int[] arr = {64, 25, 12, 22, 11};

        SelectionSort.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    @Test
    public void test_sortArrayWorstCase() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        SelectionSort.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
