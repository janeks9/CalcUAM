package calculator;

import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void CalculateRectCircTest() {assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

    @Test
    public void FahrenheitToCelsius() {assertEquals(19.0, calculator.convertFarenheitToCelsius(66));}

    @Test
    public void FelsiusToFahrenheit() {assertEquals(73.4, calculator.convertCelsiusToFarenheit(23));}

    @Test
    public void MphToKph() {assertEquals(72.45, calculator.convertFromMphToKph(45));}

    @Test
    public void TriangleCirc() {assertEquals(24.0, calculator.CalculateTriangleCirc(6,8,10));}

    @Test
    public void TriangleArea() {assertEquals(8.0, calculator.CalculateTriangleArea(4,4));}

    @Test
    public void SquareCirc() {assertEquals(12, calculator.CalculateSquareCirc(3));}

    @Test
    public void SquareArea() {assertEquals(49.0, calculator.CalculateSquareArea(7));}

    @Test
    public void RectArea() {assertEquals(12.0, calculator.CalculateRectArea(3,4));}

    @Test
    public void SquareRoot() {assertEquals(3.0, calculator.sqrt(9));}

    @Test
    public void PowerNumbers() {assertEquals(125.0, calculator.powerTwoNumbers(5,3));}

    @Test
    public void FactorialCount() {assertEquals(720, calculator.factorial(6));}

    @Test
    public void FibonacciCount() {assertEquals(6765, calculator.fibbonacci(20));}

    @Test
    public void GCDCounting() {assertEquals(1, calculator.findGCD(1, 128));}

    @Test
    public void LCMCounting() {assertEquals(1584, calculator.findLCM(22, 144));}

    @Test
    public void ShouldReturnFalseIfNumberIs0() {assertEquals(calculator.isPrime(0), false);}

    @Test
    public void ShouldReturnFalseIfNumberIs1() {assertEquals(calculator.isPrime(1), false);}

    @Test
    public void ShouldReturnFalseIfNumberIs25() {assertEquals(calculator.isPrime(25), false);}

    @Test
    public void ShouldReturnTrueIfNumberIs11() {assertEquals(calculator.isPrime(11), true);}

    @Test
    public void ShouldReturnFalseIfNumberIs12() {assertEquals(calculator.isPrime(12), false);}

}
