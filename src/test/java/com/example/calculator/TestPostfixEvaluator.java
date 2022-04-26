package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPostfixEvaluator {
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANumber() {
        PostfixEvaluator eval = new PostfixEvaluator();
        eval.addToken(new Operand(3));
        eval.addToken(new Operand(2));
        eval.addToken(new Multiplication());
        eval.addToken(new Operand(5));
        eval.addToken(new Addition());
        eval.addToken(new Operand(6));
        eval.addToken(new Operand(4));
        eval.addToken(new Multiplication());
        eval.addToken(new Addition());
        assertEquals(eval.evaluate(), 35);
    }
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANumber2() {
        PostfixEvaluator eval = new PostfixEvaluator();
        eval.addToken(new Operand(3));
        eval.addToken(new Operand(9));
        eval.addToken(new Division());
        eval.addToken(new Operand(2));
        eval.addToken(new Multiplication());
        assertEquals(eval.evaluate(), 6);
    }
    @Test
    public void
    PostfixEvaluator_ExpressionWithOneOperandOnlyAndOneOperator_ThrowsArithmeticException()
    {
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.addToken(new Operand(3));
            evaluator.addToken(new Multiplication());
            evaluator.evaluate();
        });
        String expectedMessage = "Cannot evaluate with operator with less than two operands.";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void
    PostfixEvaluator_ExpressionWithTwoOperandsNoOperators_ThrowsArithmeticException()
    {
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.addToken(new Operand(3));
            evaluator.addToken(new Operand(5));
            evaluator.evaluate();
        });
        String expectedMessage = "Cannot evaluate expression with trailing operand.";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void PostfixEvaluator_TestOurTeacherAskedUsToWrite_WeDontKnowYet(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.evaluate();
    }
}
