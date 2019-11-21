package com.ustglobal.array;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		
		//System.out.println(nums[20]);ArrayIndexOutOfBoundsException
		recieve(nums);
		String[] arr = getString();
		for(String str1 : arr) {
		System.out.println("jhjh"+str1);
		}
	}
	static void recieve(int[] numbers) {
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(i +" index value is :"+numbers[i]);
		}
		
		for(int num : numbers) 
		{
			System.out.println(num);
		}
	}
		static int[] getArray()
		{
		int[] value = {10, 20, 30};
		return value;
		}
		
		String[] str = {"hi", "hello"};
		
		
		static void recieve(String[] str) {
			for(int i = 0; i < str.length; i++)
			{
				System.out.println(i +" index value is :"+str[i]);
			}
			for(String str1 : str) {
				System.out.println(str1);
		}
		}
			
			static String[] getString()
			{
			String[] value = {"hi", "hello"};
			return value;
			}		
		
		
	}

