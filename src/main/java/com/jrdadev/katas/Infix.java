package com.jrdadev.katas;

import java.util.ArrayList;
import java.util.List;

public class Infix {
	public String toPostfix(String infix) {
		if (infix == null || infix.isEmpty()) {
			return "";
		}

		if (infix.length() == 1) {
			return infix;
		}

		char[] charsInfix = getChars(infix);

		List<String> operandList = getOperands(charsInfix);
		List<String> operatorList = getOperators(charsInfix);

		return createResponse(operandList, operatorList);
	}

	private String createResponse(List<String> operandList, List<String> operatorList) {
		String response = "";
		for (String s : operandList) {
			response += s + " ";
		}

		for (int i = operatorList.size() - 1; i >= 0; i--) {
			response += operatorList.get(i) + " ";
		}
		return response.trim();
	}

	private List<String> getOperators(char[] charsInfix) {
		List<String> operatorList = new ArrayList<>();
		for (int i = 0; i < charsInfix.length; i++) {
			if (!Character.isDigit(charsInfix[i])) {
				operatorList.add(charsInfix[i] + "");
			}
		}
		return operatorList;
	}

	private List<String> getOperands(char[] charsInfix) {
		List<String> operandList = new ArrayList<>();
		String operand = "";
		for (int i = 0; i < charsInfix.length; i++) {
			if (Character.isDigit(charsInfix[i])) {
				operand += charsInfix[i];

				boolean isLastCharacter = i == (charsInfix.length - 1);
				if (isLastCharacter) {
					operandList.add(operand);
				}
			} else {
				operandList.add(operand);
				operand = "";
			}
		}
		return operandList;
	}

	private char[] getChars(String infix) {
		infix = infix.replace(" ", "");
		char[] charsInfix = new char[infix.length()];
		infix.getChars(0, infix.length(), charsInfix, 0);
		return charsInfix;
	}
}
