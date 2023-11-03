package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_49 {
	static void printBefore30Min(int hour, int minute) {
		int time = hour * 60 + minute;
		time -= 30;
		
		if (time <= 0) {
			time += 24 * 60;
		}
		
		int h = time / 60;
		int m = time % 60;
		System.out.printf("%d %d", h, m);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		printBefore30Min(hour, minute);
		scan.close();
	}
	
}