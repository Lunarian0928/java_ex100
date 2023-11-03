package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_69 {
	static void printAnswer(int a, int d, int n) {	
		System.out.printf("%d", a + d * (n - 1));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		printAnswer(a, d, n);
		scan.close();
	}
	
}