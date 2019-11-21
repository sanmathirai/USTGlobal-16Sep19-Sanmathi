package com.ustglobal.typecasting.refference;

public class Marker extends Pen{
	double size;
	void color() {
			System.out.println("Marker color() method");
	}
	@Override
	void write() {
		System.out.println("Marker Write method");
	}
	
}
