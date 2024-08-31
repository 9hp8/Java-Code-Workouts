package java_coding_basics;
import java.util.Scanner;
public class SumSeries {

	public static long seriesSum(int n) {
	    long sum=0;
	    for(int i=0;i<=n;i++){
	        sum += i; 
	    }
	     return sum;
	    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(SumSeries.seriesSum(num));
		
	}

}
