package java_coding_string;

import java.util.Scanner;
public class DifferenceInStrings {
	// Program to find the difference between two strings 
	
	public char findTheDifference(String s, String t) {
		
		int result = 0;
		for(int i=0;i<s.length();i++) {
			result ^= s.charAt(i);
		}
		for(int i=0;i<t.length();i++) {
				result ^= t.charAt(i); 	
				}
		return (char)result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); // abcd
		String t = scan.nextLine(); // abcde
		
		DifferenceInStrings differenceInStrings = new DifferenceInStrings();
		char result = differenceInStrings.findTheDifference(s, t);
		System.out.println(result);
		
	}

}
