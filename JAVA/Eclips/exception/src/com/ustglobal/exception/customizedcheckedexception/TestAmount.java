package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("Main started");
	ValidateAmount va = new ValidateAmount();
	try {
		va.checkAmount(45000);
		System.out.println("Withdraw your cash");
		
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
	System.out.println("Main ended");
}
}
