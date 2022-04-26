package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Test
    public void
    DivisionEvaluate_TwoPositiveOperands_DivideTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(3);
        Division division = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(),2);
    }
}
