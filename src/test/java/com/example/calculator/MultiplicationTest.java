package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    public void
    MultiplicationEvaluate_TwoPositiveOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Multiplication multiplication = new Multiplication();
        Operand result = multiplication.evaluate(op1, op2);
        assertEquals(result.getValue(),6);
    }
}
