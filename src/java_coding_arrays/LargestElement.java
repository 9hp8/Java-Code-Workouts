package java_coding_arrays;

import java.util.Scanner;
public class LargestElement {

	public static int largestElement(int[] arr) {
		Integer largest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > largest) {
				largest = num;
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("Enter the elements into the array");
		for(int i=0;i<num;i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = largestElement(arr);
		System.out.println("The largest element of the given array is "+ result+".");
		
	}

}
