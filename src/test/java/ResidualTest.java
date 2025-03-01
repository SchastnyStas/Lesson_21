import org.testng.Assert;
import org.testng.annotations.Test;
import util.Retry;

public class ResidualTest extends BaseTest {

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Residual zero result",
            description = "Check user can reside numbers with zero result",
            priority = 7,
            retryAnalyzer = Retry.class)
    public void residualNumbersZeroResult(int a) {
        int result = calculator.reside(a, a);
        Assert.assertEquals(result, 0);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Negative numbers for residual",
            description = "Check user can negative positive numbers",
            priority = 8,
            retryAnalyzer = Retry.class)
    public void residualNumbersNegativeResult(int x, int y, int expectedResult) {
        int result = calculator.reside(x, y);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Positive numbers for residual",
            description = "Check user can residual positive numbers",
            priority = 9,
            retryAnalyzer = Retry.class)
    public void residualNumbersPositiveResult(int x, int y, int expectedResult) {
        int result = calculator.reside(x, y);
        Assert.assertEquals(result, expectedResult);
    }
}