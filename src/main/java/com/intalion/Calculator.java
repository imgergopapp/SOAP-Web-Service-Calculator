package com.intalion;

public class Calculator implements BasicArithmeticOperations{
	public double add(double summandOne, double summandTwo) {
		return summandOne + summandTwo;
	}

	public double substract(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

	public double multiply(double multiplier, double multiplicand) {
		return multiplier * multiplicand;
	}

	public double divide(double dividend, double divisor) {
		if (divisor == 0d) {
			throw new ArithmeticException("Can't divide by 0!");
		} else {
			return dividend / divisor;
		}
	}
}