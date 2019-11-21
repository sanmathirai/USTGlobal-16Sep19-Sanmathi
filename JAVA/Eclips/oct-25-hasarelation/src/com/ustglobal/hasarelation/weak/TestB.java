package com.ustglobal.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {

		Car c = new Car();

		System.out.println("car color :"+c.color);
		c.move();

		System.out.println("**************");

		System.out.println(c.m.music);
		c.m.playMusic();
	}
}
