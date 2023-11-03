package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_51 {
	
	static int compress(int n) {
		String str = Integer.toString(n);
		str = str.substring(1) + str.substring(0, 1);
		
		int compressed = Integer.parseInt(str) * 2;
		return compressed;
	}
	static void printAnswer(int n) {
		int amount = compress(n);
		String comment = "GOOD";
		if (amount > 50)
			comment = "OH MY GOD";
		System.out.println(amount);
		System.out.println(comment);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}
