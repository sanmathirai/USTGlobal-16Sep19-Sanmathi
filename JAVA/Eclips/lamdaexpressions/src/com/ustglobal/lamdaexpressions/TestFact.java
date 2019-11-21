package com.ustglobal.lamdaexpressions;

public class TestFact {
	public static void main(String[] args) {
		
		Factorial f =num->{
			
			int fact=1;
			for(int i=2;i<=num ;i++)
				fact=fact*i;
			return fact;
			
		};
		
		int factorial = f.fact(5);
		System.out.println(factorial);


	}
}
