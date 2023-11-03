package java_ex100.twenty_to_twentynine;

import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("%d", a * (int)Math.pow(2, b));
		scan.close();
	}

}
