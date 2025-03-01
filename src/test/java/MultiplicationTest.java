import org.testng.Assert;
import org.testng.annotations.Test;
import util.Retry;

public class MultiplicationTest extends BaseTest {

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Positive numbers for multiply",
            description = "Check user can multiply positive numbers",
            priority = 4,
            retryAnalyzer = Retry.class)
    public void multiplyNumbersPositive(int x, int y, int expectedResult) {
        int result = calculator.multiply(x, y);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Negative numbers for multiply",
            description = "Check user can multiply negative numbers",
            priority = 5,
            retryAnalyzer = Retry.class)
    public void multiplyNumbersNegative(int x, int y, int expectedResult) {
        int result = calculator.multiply(x, y);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Zero numbers for multiply",
            description = "Check user can multiply by zero",
            priority = 6,
            retryAnalyzer = Retry.class)
    public void multiplyNumbersByZero(int x, int y, int expectedResult) {
        int result = calculator.multiply(x, y);
        Assert.assertEquals(result, expectedResult);
    }
}