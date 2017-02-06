import org.junit.Assert;
import org.junit.Test;

public class FibonacciLastDigitTest {


    @Test
    public void test_getFibonacciLastDigitNaive() {
        Assert.assertEquals(2, FibonacciLastDigit.getFibonacciLastDigitNaive(3));
    }

    @Test
    public void test_getFibonacciLastDigit() {
        Assert.assertEquals(2, FibonacciLastDigit.getFibonacciLastDigitRemainder(3));
    }

    @Test
    public void test_getFibonacciLastDigit_bigNumber() {
        Assert.assertEquals(9, FibonacciLastDigit.getFibonacciLastDigitRemainder(331));
    }

    @Test
    public void test_getFibonacciLastDigit_bigBigNumber() {
        Assert.assertEquals(5, FibonacciLastDigit.getFibonacciLastDigitRemainder(327305));
    }

}
