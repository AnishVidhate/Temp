package com.demo.services;

public class SearchServices {
	public int  bSearch(Integer[] arr, int high, int low, int num) {
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

	public int addNumber(int i) {
		int num=i;
		if(num>0) {
			return ( i+ addNumber(num-1));
		}
		else {
			return 0;
		}
		
	}

	public int calcFactorial(int num) {
		int fnum=num;
		if(fnum>1) {
			return (fnum*calcFactorial(fnum-1));
		}
		else {
			return 1;
		}
	}

	public int sequentialSearch(Integer[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				return i;
			}
			else continue;
		}
		return -1;
	}
	
}
