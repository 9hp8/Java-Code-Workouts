package java_coding_basics;

import java.util.Scanner;
public class PrimeNumber {

	static Scanner scan = new Scanner(System.in);
	
	public void primeNumber(int num) {
		//num = 10 , 2,3,4,5
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num %i == 0) {
				System.out.println(num+" is not Prime");
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is Prime");
		}
		
		
	
	}
	public static void main(String[] args) {
 
	int num =scan.nextInt();
	PrimeNumber prime = new PrimeNumber();
	prime.primeNumber(num);	
		
	}

}
