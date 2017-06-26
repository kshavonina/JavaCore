package June26;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testIsEven() {
        Main main = new Main();
        // если здесь метод isEven объявлен как private, то тест сделать будет нельзя
        // если сделать package, то все ок, т.к. пакет один и тот же
        Assert.assertTrue(main.isEven(2));

    }
}
