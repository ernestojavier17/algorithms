package ArraysAndStrings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindAnagramTest {

    private FindAnagramDifference target;

    @Before
    public void setUp() {
        target = new FindAnagramDifference();
    }

    @Test
    public void test_charactersToRemove() {
        String s1 = "hello";
        String s2 = "billion";

        Assert.assertEquals(6, target.charactersToRemove(s1, s2));
    }
}
