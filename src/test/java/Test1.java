import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
   Calculator calculator = new Calculator();

    @Test
    public void testingCalc1() {
        double res = (calculator.plus(4, 2));
        assertEquals(6.0, res);
    }

    @Test
    public void testingCalc2() {
        double res1 = calculator.minus(123, 56);
        assertEquals(67.0, res1);
    }

    @Test
    public void testingCalc3() {
        double res2 = calculator.divide(354, 20);
        assertEquals(17.0, res2);
    }

    @Test
    public void testingCalc4() {
        double res3 = calculator.multiply(64, 4);
        assertEquals(256.0, res3);
    }

    @Test
    public void testingCalc5() {
        double res4 = calculator.minus(123, 56);
        assertEquals(67.0, res4);
    }

    @Test
    public void testingCalc6() {
        double res5 = calculator.divide(342, 6);
        assertEquals(57.0, res5);
    }

    @Test
    public void testingCalc7() {
        double res6 = calculator.multiply(-365, 25);
        assertEquals(-9125.0, res6);
    }





}
