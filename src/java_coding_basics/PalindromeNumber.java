package java_coding_basics;

import java.util.Scanner;
public class PalindromeNumber {

	public static boolean palindrome(int x) {
		  if(x<0 || (x%10 ==0 && x!=0 )){
		        return false;
		      }

		      int reversedhalf = 0;
		      while(x > reversedhalf){
		        reversedhalf = reversedhalf * 10 + x % 10;
		        x/=10;
		      }
		      return x == reversedhalf || x == reversedhalf / 10;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((palindrome(num)));
	}

}
