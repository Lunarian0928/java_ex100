package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_38 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.printf("%.1f", (float)a * b / 2);
		
		scan.close();
	}
	
}
