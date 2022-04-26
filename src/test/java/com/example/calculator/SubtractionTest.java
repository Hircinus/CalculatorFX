package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    @Test
    public void
    SubtractionEvaluate_TwoPositiveOperands_SubtractTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(3);
        Subtraction subtraction = new Subtraction();
        Operand result = subtraction.evaluate(op1, op2);
        assertEquals(result.getValue(),3);
    }
}
