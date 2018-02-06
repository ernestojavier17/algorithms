package recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void factorial_testFactorialOf5() {
        Assert.assertEquals(factorial.calFac(5), 120);
    }

    @Test
    public void factorial_testFactorialOf3() {
        Assert.assertEquals(factorial.calFac(3), 6);
    }

    @Test
    public void factorial_testFactorialOf1() {
        Assert.assertEquals(factorial.calFac(1), 1);
    }

    @Test
    public void factorial_testFactorialOf0() {
        Assert.assertEquals(factorial.calFac(0), 1);
    }

    @Test
    public void factorial_testFactorialOf10() {
        Assert.assertEquals(factorial.calFac(10), 3628800);
    }


}
