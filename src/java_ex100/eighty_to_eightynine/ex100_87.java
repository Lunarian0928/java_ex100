package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_87 {
	static void printStar(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("*");
	}
	
	static void printAnswer(int n) {
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				printStar(n);
			} else {
				printStar(2);
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