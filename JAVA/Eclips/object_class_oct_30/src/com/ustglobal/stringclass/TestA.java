package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "Aishu";
		String s2 = "Sanmathi";
		
		String s3 = new String("Aishu");
		String s4 = new String("Aishu");
		String s5 = "Aishu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		char s8 = s1.charAt(0);
		System.out.println(s8);
		
		boolean s9 = s1.equalsIgnoreCase(s2);
		System.out.println(s9);
		
		StringBuffer sb1 =  new StringBuffer("Sanmathi Rao\n");
		StringBuffer sb2=sb1.append("Sanmathi Rai");
		System.out.println(sb2);
		
		
		
		
	}
}
