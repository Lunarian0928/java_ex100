package java_ex100.twenty_to_twentynine;

import java.util.Scanner;

public class ex100_29 {
	static void printJudge(int n) {
		if (n % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		printJudge(a);
		printJudge(b);
		printJudge(c);
		scan.close();
	}
	
}
