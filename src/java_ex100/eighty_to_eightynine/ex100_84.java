package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_84 {
	static void printAnswer(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
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