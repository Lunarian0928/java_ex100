package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_35 {
	static int getAnswer(int n) {
		if (n <= 0) {
			return 0; 
		}
		if (n % 2 == 1) 
			return getAnswer(n - 1);
		
		return n + getAnswer(n - 2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(getAnswer(n));
		scan.close();
	}
	
}
