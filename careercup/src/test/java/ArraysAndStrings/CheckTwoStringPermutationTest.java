package ArraysAndStrings;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckTwoStringPermutationTest {

    private CheckTwoStringPermutation target;

    @Before
    public void setUp() {
        target = new CheckTwoStringPermutation();
    }

    @Test
    public void test_permutationTrue() {
        Assert.assertTrue(target.permutation("abac", "aacb"));
    }
}
