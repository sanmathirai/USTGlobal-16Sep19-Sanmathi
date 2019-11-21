package com.ustglobal.beanproject.bean;

import java.util.Scanner;

public class TestC {
public static void main(String[] args) {
	System.out.println("Scanner package");
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("ENter age");
	int age = sc.nextInt();
	
	System.out.println("Age is "+age);
	
	System.out.println("Enter Name");
	String name = sc.next();
	System.out.println(name);
	
	System.out.println("Are you female");
	Boolean result = sc.hasNextBoolean();
	System.out.println();
	
	System.out.println("enter address");
	String add =  sc.nextLine();

}
}
