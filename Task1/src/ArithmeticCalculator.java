

public class ArithmeticCalculator {

    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation op) {
        if (op == Operation.ADD) {
            System.out.println(a+b);
        }
        else if (op == Operation.SUBTRACT) {
            System.out.println(a-b);
        }
        else if (op == Operation.MULTIPLY) {
            System.out.println(a*b);
        }
        else {
            System.out.println("Неизвестная операция");
        }
    }
}


