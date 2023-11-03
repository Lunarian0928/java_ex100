package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_30 {
	static void printSign(int n) {
		System.out.println(n < 0 ? "minus" : "plus");
	}
	
	static void printJudge(int n) {
		if (n % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}
	
	static void printAnswer(int n) {
		printSign(n);
		printJudge(n);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}
