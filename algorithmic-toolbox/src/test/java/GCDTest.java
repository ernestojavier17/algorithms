import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void test_euclidGCD_verifyCorrectResult() {
        Assert.assertEquals(2, GCD.euclidGCD(2, 4));
    }
}
