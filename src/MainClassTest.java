import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void assertNumberTest(){
        Assert.assertTrue("Результат вычисления не равен 14",new MainClass().getLocalNumber() == 14);
    }
}
