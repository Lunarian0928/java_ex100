package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_46 {
	
	static void printAnswer(int h) {
		String comment = "PASS";
		if (h <= 170) {
			comment = "CRASH";
		}
		System.out.println(comment);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h1 = scan.nextInt();
		int h2 = scan.nextInt();
		int h3 = scan.nextInt();
		
		printAnswer(h1);
		printAnswer(h2);
		printAnswer(h3);
		scan.close();
	}
	
}
