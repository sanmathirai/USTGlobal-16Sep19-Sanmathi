package com.ustglobal.atmmachine;

public class TestA {

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		SBI s = new SBI();
		Machine m = new Machine();
		
		m.slot(h);
		m.slot(i);
		m.slot(s);
	}
}
