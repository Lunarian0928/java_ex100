package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_57 {
	static int getCalorie(int menu) {
		switch(menu) {
			case 1:
				return 400;
			case 2:
				return 340;
			case 3:
				return 170;
			case 4:
				return 100;
			case 5:
				return 70;
			default:
				return 0;
		}
	}
	
	static void printAnswer(int menu1, int menu2) {
		System.out.println(getCalorie(menu1) + getCalorie(menu2) >= 500 ? "angry" : "no angry");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu1 = scan.nextInt();
		int menu2 = scan.nextInt();
		printAnswer(menu1, menu2);
		scan.close();
	}
	
}
