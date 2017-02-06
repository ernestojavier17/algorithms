/*
 * FibonacciNumbersTest.java
 *
 * Jan 29, 2017
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

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ernesto Olivo   (ernesto.olivo@smartmatic.com).
 * @version 6.0.1.SL (Jan 29, 2017).
 */
public class FibonacciNumbersTest {


    @Test
    public void test_naive_verifyCorrectFibonnaciNumber() {
        Assert.assertEquals(2, FibonacciNumbers.naive(3));
        Assert.assertEquals(8, FibonacciNumbers.naive(6));
        Assert.assertEquals(23416728348467685L, FibonacciNumbers.naive(80));
    }
}
