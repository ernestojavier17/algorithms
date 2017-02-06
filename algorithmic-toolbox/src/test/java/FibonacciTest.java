import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test_calc_fib() {
        Assert.assertEquals(2, Fibonacci.calc_fib(3));
        Assert.assertEquals(55, Fibonacci.calc_fib(10));
    }

    @Test
    public void test_calc_fib_bigNumber() {
        Assert.assertEquals(12586269025L, Fibonacci.calc_fib(50));
    }

    @Test
    public void test_calc_fib_fast() {
        Assert.assertEquals(2, Fibonacci.calc_fib_fast(3));
        Assert.assertEquals(55, Fibonacci.calc_fib_fast(10));
    }

    @Test
    public void test_calc_fib_fast_bigNumber() {
        Assert.assertEquals(102334155, Fibonacci.calc_fib_fast(40));
    }

    @Test
    public void test_calc_fib_cornerCases() {
        Assert.assertEquals(0, Fibonacci.calc_fib(0));
        Assert.assertEquals(1, Fibonacci.calc_fib(1));
    }

    @Test
    public void test_calc_fib_fast_cornerCases() {
        Assert.assertEquals(0, Fibonacci.calc_fib_fast(0));
        Assert.assertEquals(1, Fibonacci.calc_fib_fast(1));
    }
}
