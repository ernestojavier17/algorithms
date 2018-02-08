package recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome_TrueOddWord() {
        Assert.assertTrue(palindrome.isPalindrome("rotor"));
    }

    @Test
    public void isPalindrome_TrueEvenWord() {
        Assert.assertTrue(palindrome.isPalindrome("redder"));
    }

    @Test
    public void isPalindrome_False() {
        Assert.assertFalse(palindrome.isPalindrome("motor"));
    }


    @Test
    public void isPalindromeR_TrueOddWord() {
        Assert.assertTrue(palindrome.isPalindromeR("rotor".toCharArray(), 0));
    }

    @Test
    public void isPalindromeR_TrueEvenWord() {
        Assert.assertTrue(palindrome.isPalindromeR("redder".toCharArray(), 0));
    }

    @Test
    public void isPalindromeR_False() {
        Assert.assertFalse(palindrome.isPalindromeR("motor".toCharArray(), 0));
    }

    @Test
    public void isPalindromeR_TrueOneLetter() {
        Assert.assertTrue(palindrome.isPalindromeR("m".toCharArray(), 0));
    }

    @Test
    public void isPalindromeR_TrueOddLongWord() {
        Assert.assertTrue(palindrome.isPalindromeR("rootoor".toCharArray(), 0));
    }

    @Test
    public void indexPalindrome_WordIsPalindrome() {
        Assert.assertEquals(-1, palindrome.palindromeIndex("aaa".toCharArray()));
    }

    @Test
    public void indexPalindrome_WordIsNotPalindrome() {
        Assert.assertEquals(3, palindrome.palindromeIndex("aaab".toCharArray()));
    }
}
