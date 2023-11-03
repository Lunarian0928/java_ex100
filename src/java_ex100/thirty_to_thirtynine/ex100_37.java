package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_37 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
	
}
