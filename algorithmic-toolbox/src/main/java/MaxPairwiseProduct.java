import java.math.BigInteger;
import java.util.*;
import java.io.*;

/**
 * Programming Assignment: Maximum Pairwise Product
 * Given a sequence of non-negative integers a0,…,an−1, find the maximum pairwise product, that is, the largest integer
 * that can be obtained by multiplying two different elements from the sequence (or, more formally, max aiaj 0≤i≠j≤n−1).
 * Different elements here mean ai and aj with i≠j (it can be the case that ai=aj).
 *
 * Test on the examples from the problem statement. Then make a few other small tests, solve them manually and check
 * that your program outputs the correct answer. Generate a big input and launch your program to check that it works
 * fast enough and doesn't consume too much memory. Test for corner cases: smallest allowed values and largest allowed
 * values of all input parameters, equal numbers in the input, very long strings, etc. Then make a stress test. After
 * all these tests passed, submit the solution.
 */
public class MaxPairwiseProduct {

    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long) numbers[i] * numbers[j] > result) {
                    result = (long) numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    static long getMaxPairwiseProductFast(int[] numbers) {
        int n = numbers.length;
        int maxPairPos1 = 1;
        for(int i=1; i<n; i++) {
            if(numbers[i] > numbers[maxPairPos1]) {
                maxPairPos1 = i;
            }
        }
        int maxPairPos2 = 0;
        for(int j=0; j<n; j++) {
            if((numbers[j] > numbers[maxPairPos2]) && (j != maxPairPos1)) {
                maxPairPos2 = j;
            }
        }
        //System.out.println("maxPairPos1: "+maxPairPos1+ " maxPairPos2: "+maxPairPos2);
        return (long) numbers[maxPairPos1] * numbers[maxPairPos2];
    }

    public static void main(String[] args) {
        /*while(true) {
            BigInteger random = new BigInteger(31, new Random());
            int n = random.intValue() % 10 + 2;
            int[] numbers = new int[n];
            for(int i=0; i<n; i++) {
                numbers[i] = new BigInteger(31, new Random()).intValue() % 100000;
            }
            for(int i=0; i<n; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("");
            long rest1 = getMaxPairwiseProduct(numbers);
            long rest2 = getMaxPairwiseProductFast(numbers);
            if(rest1 != rest2) {
                System.out.println("Wrong answer: " +rest1+ " " +rest2);
            } else {
                System.out.println("Ok");
            }
            System.out.println(n);
        }*/

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
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