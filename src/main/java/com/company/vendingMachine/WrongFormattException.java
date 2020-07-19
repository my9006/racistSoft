package com.company.vendingMachine;

public class WrongFormattException extends RuntimeException {

	public WrongFormattException() {
	}

	@Override
	public String toString() {
		return "WrongFormattException: The command should be 'Letter':'Number' in the range Letter -A, B, C, Number-0,1,2";
	}
}
