package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_54 {
	static void printMultiply(int n1, int n2) {
		System.out.printf("%d*%d=%d\n", n1, n2 / n1, n2);
	}
	
	static void printAnswer(int a, int b) {
		if (b % a == 0) {
			printMultiply(a, b);
		} else if (a % b == 0) {
			printMultiply(b, a);
		} else {
			System.out.println("none");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		printAnswer(a, b);
		scan.close();
	}
	
}
