import org.testng.annotations.DataProvider;

public class CalculatorTestData {

    @DataProvider(name = "Positive numbers for division")
    public Object[][] positiveNumbersDivision() {
        return new Object[][]{
                {60, 10, 6},
                {5, 1, 5},
                {25, 5, 5}
        };
    }

    @DataProvider(name = "Negative numbers for division")
    public Object[][] negativeNumbersDivision() {
        return new Object[][]{
                {-60, -10, 6},
                {-7, 7, -1},
                {25, -5, -5}
        };
    }

    @DataProvider(name = "Positive numbers for multiply")
    public Object[][] positiveNumbersMultiply() {
        return new Object[][]{
                {7, 7, 49},
                {5, 1, 5},
                {2, 2, 4}
        };
    }

    @DataProvider(name = "Negative numbers for multiply")
    public Object[][] negativeNumbersMultiply() {
        return new Object[][]{
                {-6, -10, 60},
                {-1, 1, -1},
                {10, -5, -50}
        };
    }

    @DataProvider(name = "Zero numbers for multiply")
    public Object[][] zeroNumbersMultiply() {
        return new Object[][]{
                {0, 10, 0},
                {-7, 0, 0},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "Residual zero result")
    public Object[][] residualZeroResult() {
        return new Object[][]{
                {7}, {12}, {98}
        };
    }

    @DataProvider(name = "Negative numbers for residual")
    public Object[][] negativeNumbersResidual() {
        return new Object[][]{
                {-10, -4, -6},
                {-100, 21, -121},
                {10, -5, 15}
        };
    }

    @DataProvider(name = "Positive numbers for residual")
    public Object[][] zeroNumbersResidual() {
        return new Object[][]{
                {11, 10, 1},
                {150, 110, 40},
                {7, 6, 1}
        };
    }

    @DataProvider(name = "Sum zero result")
    public Object[][] sumZeroResult() {
        return new Object[][]{
                {-1, 1, 0},
                {0, 20, 20},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "Negative numbers for sum")
    public Object[][] negativeNumbersSum() {
        return new Object[][]{
                {-47, 7, -40},
                {-100, -21, -121},
                {10, -5, 5}
        };
    }

    @DataProvider(name = "Positive numbers for sum")
    public Object[][] positiveNumbersSum() {
        return new Object[][]{
                {11, 10, 21},
                {150, 110, 260},
                {7, 7, 14}
        };
    }
}
