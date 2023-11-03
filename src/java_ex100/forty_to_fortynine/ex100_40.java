package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_40 {
	static void printJudge(float range) {
		if ((int)range >= 50 && (int)range <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float range = scan.nextFloat();
		printJudge(range);
		scan.close();
	}
	
}
