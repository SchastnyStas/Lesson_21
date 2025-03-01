import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

Calculator calculator;

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void endTest() {
        System.out.println("Test is finished.");
    }
}
