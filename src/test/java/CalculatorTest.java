import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        calc.setInputA(10);
        calc.setInputB(5);
        calc.sum();
        assertEquals(15, calc.getResult());
    }
}
