import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void reset() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.subtract(2);
        assertEquals(3, calculator.getResult());
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.multiply(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void exponent() {
        Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.exponent(5);
        assertEquals(1, calculator.getResult());
    }
}