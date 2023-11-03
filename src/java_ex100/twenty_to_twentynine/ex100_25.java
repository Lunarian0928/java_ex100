package java_ex100.twenty_to_twentynine;

import java.util.Scanner;

public class ex100_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a != b ? 1 : 0);
		scan.close();
	}
	
}
