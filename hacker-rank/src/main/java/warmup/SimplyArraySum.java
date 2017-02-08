package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Given an array of integers, can you find the sum of its elements?
 */
public class SimplyArraySum {

    static int getArraySum(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i = 0;
        while(i<a) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print(getArraySum(array));
    }
}
