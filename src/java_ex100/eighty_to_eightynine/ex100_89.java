package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_89 {
	
	static void printAnswer(int k) {
		int d1 = 1;
		int d2 = k - 1;
		do {
			System.out.printf("%d %d\n", d1, d2);
			d1++; d2--;
		} while (d2 > 0);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		printAnswer(k);
		scan.close();
	}
	
}