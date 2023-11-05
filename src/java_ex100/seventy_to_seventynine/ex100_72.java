package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_72 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int value = scan.nextInt();
			max = (max > value ? max : value);  
		}
		System.out.println(max);
		scan.close();
	}
	
}