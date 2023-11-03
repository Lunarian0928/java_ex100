package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_52 {
	static void printAnswer(int n) {
		String s = "th";
		
		if (n / 10 != 1) {
			switch(n % 10) {
				case 1:
					s = "st";
					break;
				case 2:
					s = "nd";
					break;
				case 3:
					s = "rd";		
			}
		}
		System.out.println(n + s);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}
