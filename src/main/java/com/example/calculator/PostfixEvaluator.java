package com.example.calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PostfixEvaluator {
    private ArrayList<Token> expression = new ArrayList<>();
    public void addToken(Token t) {
        expression.add(t);
    }
    public double evaluate() throws ArithmeticException {
        ArrayDeque<Operand> stack = new ArrayDeque<>();
        int count = 0;
        for(Token t : expression) {
            if(t.isOperand()) {
                stack.push((Operand) t);
                count++;
            }
            else {
                if(count < 2) {
                    throw new ArithmeticException("Cannot evaluate with operator with less than two operands.");
                }
                t = (Operator) t;
                Operand o1 = stack.pop();
                count--;
                Operand o2 = stack.pop();
                count--;
                stack.push(((Operator) t).evaluate(o1, o2));
                count++;
            }
        }
        if(count>1) {
            throw new ArithmeticException("Cannot evaluate expression with trailing operand.");
        }
        if(stack.isEmpty()) {
            return 0;
        }
        return stack.pop().getValue();
    }
}
