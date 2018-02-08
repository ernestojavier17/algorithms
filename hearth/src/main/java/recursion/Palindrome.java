package recursion;

import java.util.Scanner;

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

    public int palindromeIndex(char[] word) {
        int index = -1;
        int i = 0;
        int j = word.length - 1 - i;

        while(i < j) {
            if(word[i] != word[j]) {
                if(index != -1) {
                    index = -1;
                    break;
                }
                if(word[i + 1] == word[j]) {
                    index = i;
                    i++;
                } else if(word[i] == word[j - 1]) {
                    index = j;
                    j--;
                } else {
                    break;
                }
            }
            i++;
            j--;
        }
        return index;
    }

    public static int palindromeIndex(String s) {
        char[] word = s.toCharArray();
        int index = -1;
        int i = 0;
        int j = word.length - 1 - i;

        while(i < j) {
            if(word[i] != word[j]) {
                if(index != -1) {
                    index = -1;
                    break;
                }
                if(word[i + 1] == word[j]) {
                    index = i;
                    i++;
                } else if(word[i] == word[j - 1]) {
                    index = j;
                    j--;
                } else {
                    break;
                }
            }
            i++;
            j--;
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
