package com.example.calculator;

public class Subtraction extends Operator {
    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        return new Operand(op1.getValue() - op2.getValue());
    }
}
