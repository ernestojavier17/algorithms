/*
 * MaxPairwiseProductTest.java
 *
 * Jan 24, 2017
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

import org.junit.Test;
import org.junit.Assert;

public class MaxPairwiseProductTest {



    @Test
    public void test_getMaxPairwiseProduct_verifyMaxPairProductInArrayIsCorrect() {
        int[] numbers = {78395, 21546, 42186};

        long r = MaxPairwiseProduct.getMaxPairwiseProduct(numbers);
        Assert.assertEquals(3307171470L, r);
    }

    @Test
    public void test_getMaxPairwiseProduct_productOfBigNumber() {
        int[] numbers = {100000, 90000};

        long r = MaxPairwiseProduct.getMaxPairwiseProduct(numbers);
        Assert.assertEquals(9000000000L, r);
    }

    @Test
    public void test_getMaxPairwiseProductFast_verifyMaxPairProductInArrayIsCorrect() {
        int[] numbers = {2, 3, 4, 1, 1};

        long r = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);
        Assert.assertEquals(12, r);
    }

    @Test
    public void test_getMaxPairwiseProductFast_productOfBigNumber() {
        int[] numbers = {100000, 90000};

        long r = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);
        Assert.assertEquals(9000000000L, r);
    }

    @Test
    public void test_getMaxPairwiseProductFast_productOfSameMaxNumber() {
        int[] numbers = {2, 9, 3, 1, 9};

        long r = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);
        Assert.assertEquals(81, r);
    }

    @Test
    public void test_getMaxPairwiseProductFast_productOfTwoNumbers() {
        int[] numbers = {2, 2};

        long r = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);
        Assert.assertEquals(4, r);
    }

    @Test
    public void test_getMaxPairwiseProductFast_productOfFirstAndLastMax() {
        int[] numbers = {76783, 1224, 86436};

        long r = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);
        Assert.assertEquals(6636815388L, r);
    }

}
