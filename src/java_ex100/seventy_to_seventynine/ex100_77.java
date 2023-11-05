package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_77 {
	
	static int getAnswer(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return n * getAnswer(n - 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(getAnswer(n));
		scan.close();
	}
	
}