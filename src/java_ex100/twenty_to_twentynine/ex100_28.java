package java_ex100.twenty_to_twentynine;

import java.util.Scanner;

public class ex100_28 {
	static void printEven(int n) {
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		printEven(a);
		printEven(b);
		printEven(c);
		scan.close();
	}
	
}
