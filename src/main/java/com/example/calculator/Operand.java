package com.example.calculator;

public final class Operand implements Token {
    private double value;
    public boolean isOperand() {
        return true;
    }
    public Operand(double value) {
        this.value = value;
    }
    public double getValue() {
        return this.value;
    }
}
