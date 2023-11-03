package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_66 {
	static void printAnswer(int n) {
		int total = 0;
		
		int i = 1;
		while(total < n) {
			total += i;
			i++;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printAnswer(n);
		scan.close();
	}
	
}