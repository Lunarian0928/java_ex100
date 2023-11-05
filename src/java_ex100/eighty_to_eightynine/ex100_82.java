package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_82 {
	static void printGugudan(int n) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%d\n", n, i, n*i);
		}
	}
	
	static void printAnswer(int r1, int r2) {
		for (int i = r1; i <= r2; i++) {
			printGugudan(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int r2 = scan.nextInt();
		printAnswer(r1, r2);
		scan.close();
	}
	
}