package ArraysAndStrings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharactersTest {

    private UniqueCharacters target;

    @Before
    public void setUp() {
        target = new UniqueCharacters();
    }

    @Test
    public void test_checkUniqueCharacters() {
        String unique = "abcd";
        Assert.assertTrue(target.isUniqueChars(unique));
    }

    @Test
    public void test_checkNonUniqueCharacters() {
        String unique = "abcda";
        Assert.assertFalse(target.isUniqueChars(unique));
    }
}
