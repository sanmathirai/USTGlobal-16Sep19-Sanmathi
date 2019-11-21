package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		
		System.out.println("Myid thread :"+mi.getId());
		
		// mi.setId(); there is no set id
		System.out.println("priority : "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(15);//Illegal argument esception when we try to set value greater than 10 and less thank 1
		 
		 System.out.println("main ended");
	}

}
