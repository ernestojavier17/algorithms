package recursion;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1)
            return true;
        boolean r = true;
        char[] a = word.toCharArray();
        int lastL  = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[lastL - i]) {
                r = false;
                break;
            }
        }
        return r;
    }

    public boolean isPalindromeR(char[] a, int init) {
        //Base case #1
        if(a.length / 2 - init <= 1) { // Just check half of the length of the word
            return true;
        }
        //Base case #2
        if(a[init] != a[a.length - 1 - init]) {
            return false;
        }
        //Recursive case
        return isPalindromeR(a, init + 1);
    }
}
