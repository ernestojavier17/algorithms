
public class FibonacciNumbers {

    static long naive(int length) {
        long f1 = 0;
        long f2 = 1;

        return computeFn(f1, f2, length, 1);
    }

    static long computeFn(long f1, long f2, int n, int index) {
        long fn = f1 + f2;
        index += 1;
        if(n == index) {
            return fn;
        } else {
            return computeFn(f2, fn, n, index);
        }
    }


}
