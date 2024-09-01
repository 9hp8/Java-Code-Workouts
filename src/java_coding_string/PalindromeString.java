package java_coding_string;

import  java.util.Scanner;
public class PalindromeString {

	public static boolean palindromeCheck(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean result = palindromeCheck(str);
		if(result == true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
