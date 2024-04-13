package calculator;

import calculator_pattern.Calculable;
import calculator_pattern.Calculator;
import calculator_pattern.ICalculableFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
