package June26;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private int count;

    @Before
    public void setNum() {
        count++;
    }

    @Test
    public void testIsEven() {
        Main main = new Main();
        // если здесь метод isEven объявлен как private, то тест сделать будет нельзя
        // если сделать package, то все ок, т.к. пакет один и тот же
        Assert.assertTrue( main.isEven(2));
        Assert.assertEquals("Something went wrong!", 1, count);
    }

    @Test
    public void testCount() {
        Assert.assertEquals(1, count);
    }

    @After
    public void countDegree() {
        count--;
    }

    // еще в тестировании есть аннотации Before, BeforeClass, After и AfterClass
}
