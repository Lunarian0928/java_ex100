package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_76 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		System.out.println((int)Math.pow(n, k));
		scan.close();
	}
	
}