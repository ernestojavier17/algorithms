import java.util.Date;
import java.util.Scanner;

public class Fibonacci {

  static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  static long calc_fib_fast(int length) {
    long f1 = 0;
    long f2 = 1;

    if(length == 0) {
      return 0;
    } else {
      return computeFn(f1, f2, length, 1);
    }
  }

  static long computeFn(long f1, long f2, int n, int index) {
    long fn = f1 + f2;
    index += 1;
    if(n <= index) {
      return fn;
    } else {
      return computeFn(f2, fn, n, index);
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    //System.out.println(calc_fib(n));
    Date n1 = new Date();

    System.out.println(calc_fib_fast(n));
    System.out.println("Time: "+(new Date().getTime() - n1.getTime()));
  }
}
