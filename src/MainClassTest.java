import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void assertLocalNumberTest() {
        Assert.assertTrue("Результат вычисления не равен 14", new MainClass().getLocalNumber() == 14);
    }

    @Test
    public void assertClassNumberTest() {
        Assert.assertTrue("Результат вычисления не больше 45", new MainClass().getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Строка не содержит подстроку hello|Hello",
                new MainClass().getClassString().contains("hello")
                        | new MainClass().getClassString().contains("Hello"));
    }

}
