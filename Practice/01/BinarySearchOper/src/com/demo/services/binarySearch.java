package com.demo.services;

public class binarySearch {
	public	int  bSearch(int[] arr, int high, int low, int num) {
			int mid=(high+low)/2;
			if(low<=high) {
				
				if(num==arr[mid]) {
					return mid;
				}
				
				else if(num<arr[mid]) {
					return bSearch(arr, mid-1, low,num);
				}
				else if(num>arr[mid]) {
					return bSearch(arr, high, mid+1, num);
				}
			}
			else {
				return -1;
			}
			
			return 0;
		}
}
