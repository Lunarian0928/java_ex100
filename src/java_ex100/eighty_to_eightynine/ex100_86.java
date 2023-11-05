package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_86 {
	static void printAnswer(int n) {
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}