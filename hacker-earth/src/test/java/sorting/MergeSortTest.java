package sorting;


import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void test_mergeSortBaseCase() {
        int[] array = {2, 3, 1};
        MergeSort.mergeSort(array);
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
