package com.example.calculator;

public abstract class Operator implements Token {
    public boolean isOperand() {
        return false;
    }
    abstract public Operand evaluate(Operand op1, Operand op2);
}
