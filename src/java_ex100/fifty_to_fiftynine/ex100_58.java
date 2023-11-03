package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_58 {
	static int getBigger(int n1, int n2) {
		return (n1 > n2 ? n1 : n2);
	}
	static void printAnswer(int a, int b, int c) {
		int max = getBigger(c, getBigger(a, b));
		String s = "no";
		if (max < a + b + c - max)
			s = "yes";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		printAnswer(a, b, c);
		scan.close();
	}
	
}
