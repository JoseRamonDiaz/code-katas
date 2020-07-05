package com.jrda.algorithms.balanced_brackets;

import java.util.Stack;

public class BalancedBrackets {
    public boolean areBalanced(String input) {
        String roundOPen = "(", curlyOpen = "{", squareOpen = "[";
        String roundClose = ")", curlyClose = "}", squareClose = "]";

        String[] inputArray = input.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (roundOPen.equals(inputArray[i]) || curlyOpen.equals(inputArray[i]) || squareOpen.equals(inputArray[i])) {
                //add it to the stack
                stack.push(inputArray[i]);
            } else {
                //if not same type than opening
                String currentBracket = stack.pop();

                if (currentBracket.equals(roundOPen) && !inputArray[i].equals(roundClose)) {
                    return false;
                }

                if (currentBracket.equals(curlyOpen) && !inputArray[i].equals(curlyClose)) {
                    return false;
                }

                if (currentBracket.equals(squareOpen) && !inputArray[i].equals(squareClose)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
