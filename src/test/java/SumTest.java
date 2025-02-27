import org.testng.Assert;
import org.testng.annotations.Test;
import util.Retry;

public class SumTest extends BaseTest {

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Positive numbers for sum",
            description = "Check user can sum positive numbers",
            priority = 10,
            retryAnalyzer = Retry.class)
    public void positiveSumTest(int x, int y, int expectedResult) {
        double sum = calculator.sum(x, y);
        Assert.assertEquals(sum, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Negative numbers for sum",
            description = "Check user can sum negative numbers",
            priority = 11,
            retryAnalyzer = Retry.class)
    public void negativeSumTest(int x, int y, int expectedResult) {
        double sum = calculator.sum(x, y);
        Assert.assertEquals(sum, expectedResult);
    }

    @Test(dataProviderClass = CalculatorTestData.class,
            dataProvider = "Sum zero result",
            description = "Check user can sum numbers and get zero",
            priority = 12,
            retryAnalyzer = Retry.class)
    public void zeroSumTest(int x, int y, int expectedResult) {
        double sum = calculator.sum(x, y);
        Assert.assertEquals(sum, expectedResult);
    }
}
