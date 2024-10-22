package com.demo.services;

public class ArrayServices {

	public int findMax(Integer[] arr) {
		int max= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else continue;
		}
		return max;
	}

	public Integer findSecondMax(Integer[] arr) {
		int max=arr[0];
		int smax=arr[1];
		
		for(int i=0; i<arr.length; i++ ) {
			
			if(max<arr[i]) {
				smax=max;
				max=arr[i];
			}
			else if(max>arr[i] && smax<arr[i]){
				smax=arr[i];
			}
		}
		System.out.println("MAX : "+max);
		return smax;
	}

	public Integer findSumPrime(Integer[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			boolean status= isPrime(arr[i]);
			if(status) {
				sum=sum+arr[i];
			}
			else {
			continue;
			}
		}
		return sum;
	}

	private boolean isPrime(int num) {
		boolean flag=true;
		if(num==2) {
			return true;
		}
		else if(num==1) {
			return false;
			
		}
		else {
			for(int i=2; i<num; i++) {
				if((num%i)==0){
					flag=false;
				}
				else {
					continue;
				}
			}
			if(flag) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}

}
