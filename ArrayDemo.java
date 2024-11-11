package CSCI_1302;


import java.util.Scanner;

import java.text.DecimalFormat;

public class ArrayDemo {

	public static void displayArray (double[] arr) {
		 //displays numbers in array
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		 
		for (int i = 0; i < 8; i++) {
				 System.out.print(fmt.format(arr[i])+" ");
		 }
}

	public static double averageArray (double[] arr) {
		double sum =0, average;
		 //calculates average of numbers in array using length of array
		
		for (int i = 0; i<arr.length; i++ ) {
			sum = sum + arr[i];
			
		}
			average = sum / arr.length;
			
		return average;

}
	
	
	public static void differenceArray (double[] arr, double average) {
		 //second array displaying difference from average of arr
		 
		double[] arr2 = new double [8];
			
		 for (int i = 0; i < 8; i++) {
			 arr2 [i] = arr[i] - average;
		 }
	
	displayArray(arr2);
	
}

	
	public static void main(String[] args) {
		// main method that calls previous static methods

		double[] arr = new double [8];
		Scanner scan = new Scanner(System.in);
		
		 for (int i = 0; i < arr.length; i++) 
		 {
			 System.out.println("Enter a value: ");
			 
			 arr [i] = scan.nextDouble(); 
		  
		 }
		 
		scan.close();
		
		//formatting for program output
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("Array:");
		displayArray(arr);
		System.out.println();
		System.out.println();
		System.out.println("Array Average = " + fmt.format(averageArray(arr)));
		System.out.println();
		System.out.println("Difference Array:");
		differenceArray(arr, averageArray(arr));
		
	}

}
