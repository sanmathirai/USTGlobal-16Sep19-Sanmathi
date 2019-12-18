package com.ustglobal.sortingwithtime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BubbleSort {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr =  new int[size];
		System.out.println("Enter Array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt(); 
		}
		Instant start = Instant.now();
		ob.bubbleSort(arr);
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("Bubble sort time  "+seconds+" seconds");
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
