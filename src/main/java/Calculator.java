public class Calculator {
    int result;
    public Calculator() {
        this.result = 0;
    }
    public int getResult() {
        return result;
    }
    public void add(int number) {
        result += number;
    }
    public void multiply(int number) {
        result *= number;
    }
    public void subtract(int number) {
        result += number;
    }
}
