package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_65 {
	static void printAnswer(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.printf("X ");
			} else {
				System.out.printf("%s ", Integer.toString(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}