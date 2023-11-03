package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_34 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			System.out.println(n);
			n = scan.nextInt();
		}
		scan.close();
	}
	
}
