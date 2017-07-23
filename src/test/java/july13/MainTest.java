package july13;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testSum() {
        Main main = new Main();
        Assert.assertEquals("Something going wrong", 4, main.sum(2, 2));
    }

    @Test
    public void testGetJackName() {
        Main main = new Main();
        Assert.assertEquals("Jack", main.getJackName("Jack"));
    }

}
