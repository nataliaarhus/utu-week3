import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTutorialTest {

    @Test
    void getResult() {
        Calculator_tutorial calculatorTutorial = new Calculator_tutorial();
        assertEquals(0, calculatorTutorial.getResult());
        // compares the value returned by the calculator's getResult method with 0. If the values are the same, the test passes.
    }

    @Test
    void add() {
        Calculator_tutorial calculatorTutorial = new Calculator_tutorial();
        calculatorTutorial.add(10);
        calculatorTutorial.add(-5);
        assertEquals(5, calculatorTutorial.getResult());
    }

    @Test
    void multiply() {
        Calculator_tutorial calculatorTutorial = new Calculator_tutorial();
        calculatorTutorial.add(5);
        calculatorTutorial.multiply(2);
        calculatorTutorial.multiply(-3);
        assertEquals(-30, calculatorTutorial.getResult());
    }

    @Test
    void subtract() {
        Calculator_tutorial calculatorTutorial = new Calculator_tutorial();
        calculatorTutorial.add(10);
        calculatorTutorial.subtract(5);
        assertEquals(5, calculatorTutorial.getResult());
    }

}