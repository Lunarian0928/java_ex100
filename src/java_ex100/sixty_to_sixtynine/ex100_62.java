package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_62 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		int group = scan.nextInt();
		int num = scan.nextInt();
		System.out.printf("%01d%02d%03d\n", grade, group, num);
		scan.close();
	}
	
}