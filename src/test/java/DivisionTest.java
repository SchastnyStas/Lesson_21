import org.testng.Assert;
import org.testng.annotations.Test;
import util.Retry;

import java.util.Random;

public class DivisionTest extends BaseTest {

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Positive numbers for division",
            description = "Check user can division positive numbers",
            priority = 1,
            retryAnalyzer = Retry.class)
    public void divideNumbersPositive(int x, int y, int expectedResult) {
        int result = calculator.divide(x, y);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Negative numbers for division",
            description = "Check user can division negative numbers",
            priority = 3,
            retryAnalyzer = Retry.class)
    public void divideNumbersNegative(int x, int y, int expectedResult) {
        int result = calculator.divide(x, y);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "Check user can't divide number by zero",
            priority = 2,
            retryAnalyzer = Retry.class,
            invocationCount = 3,
            threadPoolSize = 3)
    public void divideNumbersByZeroTest() {
        int number = new Random().nextInt();
        Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(number, 0);
        });
    }
}
