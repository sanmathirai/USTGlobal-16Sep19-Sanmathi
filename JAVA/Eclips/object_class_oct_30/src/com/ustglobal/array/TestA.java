package com.ustglobal.array;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[1] = 10;
		nums[0] = 20;
		nums[2] = 30;
		nums[3] = 30;
		nums[4] = 30;
		
	
		System.out.println("\n=========int array==========");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println(i +" index value is :"+nums[i]);
		}
		
		System.out.println("\n===================");
		for(int i :nums) {
			System.out.println(i);
		}
		
		System.out.println("\n=========char array==========");
		char[] ch = {'a', 'b', 'c','d'};
		for(int i = 0; i < ch.length; i++)
		{
			System.out.println(i +" index value is :"+ch[i]);
		}
		
		System.out.println("\n=========Byte array==========");
		byte[] nums1 = {1,2,3,4};
		for(int i = 0; i < nums1.length; i++)
		{
			System.out.println(i +" index value is :"+nums1[i]);
		}
		System.out.println("\n=========double array==========");
		double[] nums2 = {1, 22.2, 3, 4.2};
		for(int i = 0; i < nums2.length; i++)
		{
			System.out.println(i +" index value is :"+nums2[i]);
		}
		
		System.out.println("\n=========Boolean array==========");
		boolean[] bool = {true, false};
		for(int i = 0; i < bool.length; i++)
		{
			System.out.println(i +" index value is :"+bool[i]);
		}
		
		System.out.println("\n=========string array==========");
		String[] str = {"hi", "hello", "namaste"};
		for(int i = 0; i < str.length; i++)
		{
			System.out.println(i +" index value is :"+str[i]);
		}
		for(String str1 :str) {
			System.out.println(str1);
		}
	}
}
