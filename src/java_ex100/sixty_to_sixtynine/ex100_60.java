package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_60 {
	static int getCrashHeight(int carHeight, int tunnelHeight, int crashHeight) {
		if (crashHeight != 0) return crashHeight;
		if (carHeight > tunnelHeight) return tunnelHeight;
		return crashHeight;
	}
	static void printAnswer(int a, int b, int c) {
		int carHeight = 170;
		int crashHeight = 0;
		crashHeight = getCrashHeight(carHeight, a, crashHeight);
		crashHeight = getCrashHeight(carHeight, b, crashHeight);
		crashHeight = getCrashHeight(carHeight, c, crashHeight);
		
		String answer = "PASS";
		if (crashHeight != 0) {
			answer = "CRASH ";
			answer += crashHeight;
		}
		System.out.println(answer);
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		printAnswer(a, b, c);
		scan.close();
	}
	
}