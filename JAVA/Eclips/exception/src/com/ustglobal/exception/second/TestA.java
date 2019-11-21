package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		try {
			Thread.sleep(30000);
		}
		
		catch(InterruptedException ie) {
			System.out.println("Exception cought");
			ie.printStackTrace();
		}
		
		System.out.println("Main ended");
	}
}
