package com.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthOfLongestSubstring_3Test {

    private LengthOfLongestSubstring_3 target;

    @Before
    public void setUp() {
        target = new LengthOfLongestSubstring_3();
    }

    @Test
    public void lengthOfLongestSubstring_3RepeatedSameString() {
        String s = "abcabcabc";

        Assert.assertEquals(3, target.secondApproach(s));
    }

    @Test
    public void lengthOfLongestSubstring_1Repeated() {
        String s = "bbbbbbbb";

        Assert.assertEquals(1, target.secondApproach(s));
    }

    @Test
    public void lengthOfLongestSubstring_3RepeatedRandomString() {
        String s = "pwwkew";

        Assert.assertEquals(3, target.secondApproach(s));
    }

    @Test
    public void lengthOfLongestSubstring_2Repeated() {
        String s = "aab";

        Assert.assertEquals(2, target.secondApproach(s));
    }

    @Test
    public void lengthOfLongestSubstring_dvdf() {

        Assert.assertEquals(3, target.secondApproach("dvdf"));
    }

    @Test
    public void lengthOfLongestSubstring_ckilbkd() {

        Assert.assertEquals(5, target.secondApproach("ckilbkd"));
    }

    @Test
    public void lengthOfLongestSubstring_tmmzuxt() {
        Assert.assertEquals(5, target.secondApproach("tmmzuxt"));
    }

    @Test
    public void lengthOfLongestSubstring_bbtablud() {
        Assert.assertEquals(6, target.secondApproach("bbtablud"));
    }
}
