package java_coding_arrays;

import java.util.Scanner;
public class SecondLargestElement {
	
	public static int secondLargest(int arr[]) {
		Integer largest = Integer.MIN_VALUE ;
		Integer secondLargest = Integer.MIN_VALUE;
		
		//finding the largest value;
		for(int num : arr) {
			if(num > largest) {
				largest = num;
			}
		}
		// find the second largest distinct value 
		for(int num: arr) {
			if(num != largest && num > secondLargest) {
				secondLargest = num;
			}
		}
		// if secondLargest is not identified return -1;
		if(secondLargest == Integer.MIN_VALUE) {
			return -1;
		}
		
		return secondLargest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("Enter the array elements for "+ num + " length");
		int[] arr = new int[num];
		for(int i= 0;i<num;i++) {
			arr[i] = scan.nextInt(); 
		}
		
		int result = secondLargest(arr);
		System.out.println("The second largest element in the array is: "+ result);
	}

}
