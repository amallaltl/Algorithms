package com.algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1, 20, 80, 30, 60, 50, 
                110, 100, 130, 170};
		int x = 112;
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == x)
				System.out.println("Position = " + i);
		}

	}

}
