package sorting;


public class MergeSort {

    public static void mergeSort(int[] array) {
        int[] copy = new int[array.length];

        mergeSort(array, copy, 0, array.length - 1);
    }

    static void mergeSort(int[] array, int[] copy, int low, int high) {
        if(low < high) {
            int middle = low + ((high - low) / 2);
            mergeSort(array, copy, low, middle);
            mergeSort(array, copy, middle + 1, high);
            merge(array, copy, low, high, middle);
        }
    }

    static void merge(int[] array, int[] copy, int low, int high, int middle) {
        for(int i=low; i<=high; i++) {
            copy[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int current = low;

        while(i <= middle && j <= high) {
            if(copy[i] < copy[j]) {
                array[current] = copy[i];
                i++;
            } else {
                array[current] = copy[j];
                j++;
            }
            current++;
        }
        while(i <= middle) {
            array[current] = copy[i];
            i++;
            current++;
        }
    }

    public static void main(String[] args) {
        //int[] array = {2, 1, 3, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {2, 3, 9, 2, 2};
        MergeSort.mergeSort(array);
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
