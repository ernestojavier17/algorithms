import org.junit.Assert;
import org.junit.Test;

public class ChangeTest {

    @Test
    public void test_changeOf2() {
        int m = 2;
        Assert.assertEquals(2, Change.getChange(m));
    }

    @Test
    public void test_changeOf28() {
        int m = 28;
        Assert.assertEquals(6, Change.getChange(m));
    }

}
