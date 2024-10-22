package com.demo.test;
import java.util.Scanner;
import com.demo.services.ArrayServices;

public class TestArrayOperations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer[] arr= {1,2,3,45,5,6,7,8,9};
		
		int ch=0;
		ArrayServices a1= new ArrayServices();
		do {
				//System.out.println("\nARRAY : "+arr);
				System.out.println("\n1) Find Max num \n2) Second Max number \n3) Addition of Prime numbers \n4) Exit\nEnter choice to perform operation :");
				ch=sc.nextInt();
		switch(ch) {
		
		case 1->{
			Integer maxnum=a1.findMax(arr);
			System.out.println("Maximum number is :"+maxnum);
			}
		case 2->{
			Integer smax=a1.findSecondMax(arr);
			System.out.println("Second Max number :"+smax);
		}
		case 3->{
			Integer primesum= a1.findSumPrime(arr);
			System.out.println("Sum of Prime numbers :"+primesum);
		}

		}

	}while(ch!=4);
		sc.close();
}
}
	
