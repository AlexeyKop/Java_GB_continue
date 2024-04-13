package calculator;

import calculator_pattern.Calculable;

public final class Calculator implements calculator_pattern.Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public calculator_pattern.Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
