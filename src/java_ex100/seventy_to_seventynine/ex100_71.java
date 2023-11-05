package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_71 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scan.nextInt();
		}
		System.out.println(sum);
		scan.close();
	}
	
}