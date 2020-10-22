public class Calculator {
    private int inputA;
    private int inputB;
    private int result;

    public int getInputA() {
        return inputA;
    }

    public void setInputA(int a) {
        inputA = a;
    }

    public int getInputB() {
        return inputB;
    }

    public void setInputB(int b) {
        inputB = b;
    }

    public int getResult() {
        return result;
    }

    public void sum() {
        result = inputA + inputB;
    }

    public void minus() {
        if (inputB > inputA)
            result = inputB - inputA;
                    else
                        result = inputA - inputB;
    }
}
