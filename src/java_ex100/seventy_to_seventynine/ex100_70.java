package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_70 {
	static void printAnswer(int a, int r, int n) {
		System.out.println(a * (int)Math.pow(r, n - 1));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		printAnswer(a, r, n);
		scan.close();
	}
	
}