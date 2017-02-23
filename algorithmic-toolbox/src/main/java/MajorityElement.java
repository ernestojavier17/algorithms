import java.util.*;
import java.io.*;

/**
 * Finding a Majority Element
 */
public class MajorityElement {

    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        //write your code here
        MajorityElement.mergeSort(a, new int[a.length], 0, a.length - 1);
        int majorityElement = a[0];
        int elementFrequency = 1;
        int currentElement = -1;
        int currentFrequency = 0;

        for(int i=1; i < a.length; i++) {
            if(a[i] == majorityElement) {
                elementFrequency++;
            } else {
                if(currentElement == a[i]) {
                    currentFrequency++;
                    if(currentFrequency > elementFrequency) {
                        majorityElement = a[i];
                        elementFrequency = currentFrequency;
                    }
                } else {
                    currentElement = a[i];
                    currentFrequency = 1;
                }
            }
        }
        int elementLeft = a.length - elementFrequency;
        if(elementFrequency > elementLeft) {
            return 1;
        } else {
            return -1;
        }
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
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

