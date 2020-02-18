package org.example;

public class  MyCalc <T extends Number> {

    private T numberA;
    private T numberB;

    public T getNumberA() {
        return numberA;
    }

    public void setNumberA(T numberA) {
        this.numberA = numberA;
    }

    public T getNumberB() {
        return numberB;
    }

    public void setNumberB(T numberB) {
        this.numberB = numberB;
    }

    public Number getResult() {
        if (numberA instanceof Long)
        {
            return numberA.longValue() + numberA.longValue();
        }
        else if (numberA instanceof Double) {

            return numberA.doubleValue() + numberB.doubleValue();

        }
        return 0;
    }
}
