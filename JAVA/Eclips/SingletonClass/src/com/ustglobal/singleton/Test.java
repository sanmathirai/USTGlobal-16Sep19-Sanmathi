package com.ustglobal.singleton;

public class Test {
public static void main(String[] args) {
	MySingleton ms = MySingleton.getDbConnection();
	MySingleton mx = MySingleton.getDbConnection();
	mx.s="Hi";
	ms.s="sanm";
	System.out.println(ms.s);
	System.out.println(ms.s);
	System.out.println(ms.hashCode());
	System.out.println(mx.hashCode());
	
}
}
