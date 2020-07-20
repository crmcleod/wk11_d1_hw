import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {this.calculator = new Calculator(5, 5, 6.66, 3.00);}

    @Test
    public void canAdd(){ assertEquals(10, calculator.add()); }

    @Test
    public void canSubtract(){ assertEquals(0, calculator.subtract());}

    @Test
    public void canMultiply(){ assertEquals(25, calculator.multiply());}

    @Test
    public void canDivide(){ assertEquals(2.22, calculator.divide(), 0.01);}
}

