package calculator;

public interface Calculable {
    calculator_pattern.Calculable sum(int arg);
    calculator_pattern.Calculable multi(int arg);
    int getResult();
}
