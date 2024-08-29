package java_coding_basics;
import java.util.Scanner;

public class FibonacciSeries {
	
	static Scanner scan = new Scanner(System.in);
	
	public void Fibonaci(int num){
		int f1=0;
		int f2=1;
		
		System.out.print(f1 + " "+f2);
		for(int i=2;i<=num;i++) {
			int sum = f1+f2;
			System.out.print(" "+sum);
			f1=f2;
			f2=sum;
		}
		
	}
	public static void main(String[] args) {
		// output- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int num = scan.nextInt();
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.Fibonaci(num);
		
		
	}

}
