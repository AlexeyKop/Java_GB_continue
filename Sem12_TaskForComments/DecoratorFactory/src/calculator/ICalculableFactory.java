package calculator;

import calculator_pattern.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
