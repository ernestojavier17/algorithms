/*
 * DiagonalDifference.java
 *
 * Feb 10, 2017
 *
 * Copyright (c) Smartmatic Corp.
 * 1001 Broken Sound Parkway NW, Suite D
 * Boca Raton FL 33487, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Smartmatic Corp. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with Smartmatic Corp.
 */
package warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
 */
public class DiagonalDifference {

    static int diagDiff(int[][] a) {
        int d1 = 0;
        int d2 = 0;
        int dif = 0;
        for(int a_i=0; a_i < a.length; a_i++){
            for(int a_j=0; a_j < a.length; a_j++){
                if(a_i == a_j) {
                   d1 += a[a_i][a_j];
                }
                /*if() {

                }*/
            }
        }
        return dif;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int d1 = 0;
        int d2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }*/

        BigInteger a = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        BigInteger b = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");

        BigInteger r = a.multiply(b);

        System.out.println(r);
    }
}
