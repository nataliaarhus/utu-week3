class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;
    }

    public void multiply(int value) {
        result *= value;
    }

    public void exponent(int value) {
        //System.out.println("Result: " + result);
        for(int i=1; i<value; i++) {
            multiply(result);
        }
    }
}