package Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Calculator.Calculator;

public class CalculatorTest
{
    private Calculator calculator;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    public void testSquareRoot()
    {
        double testInput = 49;
        double expectedResult = 7.0;
        double result = calculator.squareRoot(testInput);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test
    public void testFactorial() {
        int testInput = 7;
        int expectedResult = 5040;
        int result = calculator.factorial(testInput);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testLn() {
        double testInput = 7;
        double expectedResult = 1.9459101;
        double result = calculator.ln(testInput);
        Assert.assertEquals(expectedResult, result, 0.0000005);
    }

    @Test
    public void testPower() {
        double testInput1 = 7;
        double testInput2 = 3;
        double expectedResult = 343.0;
        double result = calculator.pow(testInput1, testInput2);
        Assert.assertEquals(expectedResult, result, 0.000000005);
    }

}
