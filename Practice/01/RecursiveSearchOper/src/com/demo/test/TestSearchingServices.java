package com.demo.test;
import java.util.Scanner;
import com.demo.services.SearchServices;

public class TestSearchingServices {
	void Bearch() {
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer [] arr= {1,2,3,4,5,6,7,8,9};
		int ch=0;
		SearchServices s1= new SearchServices();
		do {
		
		System.out.println("\n1) Search in array using Binary Search \n2) Search Using Sequential \n3) Sum of number\n4) Factorial of Number\n5) Exit\nEnter choice to perform operation :");
		ch=sc.nextInt();
		switch(ch) {
			case 1:
				System.out.print("Enter Number to search :");
				int num=sc.nextInt();
				int high=arr.length-1;
				int low=0;
		
				int val=s1.bSearch(arr,high,low, num);
				if(val>=0) {
					System.out.println("Number Found at "+val+" position .");
				}
				else {
					System.out.println("Number Not Found");
				}
				break;
				
				
			case 2:
				System.out.print("Enter Number to search :");
				int num2=sc.nextInt();
				int index= s1.sequentialSearch(arr, num2);
				if(index>=0) {
					System.out.println("Number Found at "+(index+1)+" position .");
				}
				else {
					System.out.println("Number Not Found");
				}
				break;
				
				
			case 3:
				System.out.print("Enter Number upto which you want sum :");
				int sval=sc.nextInt();
				int aval=s1.addNumber(sval);
				System.out.println("Addition of Number :"+aval);
				break;
			
			case 4:
				System.out.print("Enter Number:");
				int num1;
				num1=sc.nextInt();
				int fval=s1.calcFactorial(num1);
				if(fval>0) {
					System.out.println("Sum of Factorial is :"+fval);
				}
				else {
					System.out.println("Entered Number is less than  or equal to0");
				}
				break;
				
				
			case 5:
				System.out.print("Exit");
				break;
	
		}
		}while(ch!=5);
		sc.close();
	}
	
}
