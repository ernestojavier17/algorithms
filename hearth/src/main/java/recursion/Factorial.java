package recursion;

public class Factorial {

    public int calFac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return calFac(n -1) * n;
        }
    }
}
