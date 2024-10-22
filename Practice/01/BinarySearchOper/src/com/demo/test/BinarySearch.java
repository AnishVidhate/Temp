package com.demo.test;
import java.util.Scanner;
import com.demo.services.binarySearch;

public class BinarySearch {
	void Bearch() {
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int num;
		System.out.print("Enter Number to search :");
		num=sc.nextInt();
		int high=arr.length-1;
		int low=0;
		binarySearch b1= new binarySearch();
		int val=b1.bSearch(arr,high,low, num);
		if(val>=0) {
			System.out.println("Number Found at :"+val+" position .");
		}
		else {
			System.out.println("Number Not Found");
		}
		sc.close();
	}

}
