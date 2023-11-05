package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_75 {
	static void printAnswer(int N) {
		String ans = "prime";
		for (int i = 2; i <= (int)Math.sqrt(N); i++) {
			if (N % i == 0) {
				ans = "not prime";
				break;
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		printAnswer(N);
		scan.close();
	}
	
}