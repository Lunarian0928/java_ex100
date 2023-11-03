package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_67 {
	static void printAnswer(int n) {
		if (n == 1) {
			System.out.println(1);
		} else {
			System.out.println(n);
			printAnswer(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}