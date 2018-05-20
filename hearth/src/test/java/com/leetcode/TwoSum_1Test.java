package com.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

public class TwoSum_1Test {


    private TwoSum_1 target;

    @Before
    public void setUp() {
        this.target = new TwoSum_1();
    }

    @Test
    public void twoSum_test() {
        int[] nums = {2, 7, 11, 1};

        int[] result = target.twoSum(nums, 9);

        Assert.assertTrue(Arrays.asList(new int[] {0, 1}).contains(result));
    }

    @Test
    public void twoSum_testSize3() {
        int[] nums = {3, 2, 4};

        int[] result = target.twoSum(nums, 6);

        Assert.assertTrue(Arrays.asList(new int[] {1, 2}).contains(result));
    }
}
