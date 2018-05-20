package com.leetcode;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.
    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is
    a subsequence and not a substring.
*/
public class LengthOfLongestSubstring_3 {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty())
            return 0;

        int[] array = new int[256];

        char[] chars = s.toCharArray();
        int res = 0;
        int current = 0;
        Map<Character, Integer> map = new HashMap<>();
        int index = -1;

        for (int i=0; i<chars.length; i++) {
            if (array[chars[i]] == 0 || map.get(chars[i]) <= index) {
                current++;
                array[chars[i]]++;
                map.put(chars[i], i);
            } else {
                index = map.get(chars[i]);
                current -= (index + 1);
                map.put(chars[i], i);
                current++;
            }
            if (current > res) {
                res = current;
            }
        }
        return res;
    }

    public int secondApproach(String s) {
        if(s == null || s.isEmpty())
            return 0;

        int[] array = new int[128];
        Arrays.fill(array, -1);

        char[] chars = s.toCharArray();
        int res = 0;
        int current = 0;
        int lastSub = 0;

        for (int i=0; i<chars.length; i++) {
            char ca = chars[i];
            if (array[chars[i]] == -1) {
                current++;
            } else {
                int c = array[chars[i]];
                if (c >= lastSub) {
                    current = i - c;
                    lastSub = c;
                } else {
                    current++;
                }
            }
            array[chars[i]] = i;
            if (current > res) {
                res = current;
            }
        }
        return res;
    }
}
