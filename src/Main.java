public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a, b, c;
        a = calc.plus.apply(1, 2);
        b = calc.minus.apply(1, 1);
        try {
            c = calc.devide.apply(a, b);
        } catch (ArithmeticException ex) {
            c = 0;
        }
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
}
