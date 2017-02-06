import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {

    static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    static int getFibonacciLastDigitRemainder(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        int fn = 0;
        for (int i = 0; i < n - 1; ++i) {
            fn = (previous + current) % 10;
            previous = current;
            current = fn;
        }

        return fn;
    }

    static int getFibonacciLastDigit(int n) {
        BigInteger f1 = BigInteger.ZERO;
        BigInteger f2 = BigInteger.ONE;

        if(n <= 1) {
            return n;
        }

        for(int i=0; i < n -1 ; i++) {
            BigInteger fn = f2.add(f1);
            f1 = f2;
            f2 = fn;
        }
        //System.out.print("Last digit: "+f2);
        int result = f2.remainder(BigInteger.valueOf(10)).intValue();
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int c = getFibonacciLastDigitNaive(n);
        int c = getFibonacciLastDigitRemainder(n);
        System.out.println(c);
    }
}

