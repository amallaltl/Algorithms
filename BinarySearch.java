package com.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int searchElt = 8;
		int initialPos = 0;
		int totalSize=arr.length-1;
		int position = binarySearch(arr,searchElt, initialPos,totalSize);
		System.out.println(position);
	}

	public static int binarySearch(int arr[], int searchElt, int initialPos,int endPos) {
		if(initialPos<endPos) {
			int midElt = initialPos + (endPos-1)/2; 
			
			if(arr[midElt] == searchElt)
				return midElt;
			
			if(arr[midElt]>searchElt)
				return binarySearch(arr, searchElt, initialPos, midElt-1);
			else
				return binarySearch(arr,searchElt,midElt+1,endPos);
		}
		return -1;
	}
}
