package java_coding_string;
import java.util.Scanner;
public class ReversingString {

	public static String reverseWord(String str) {
		String reverse="";
		for(int i = str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(reverseWord(str));
	}

}
