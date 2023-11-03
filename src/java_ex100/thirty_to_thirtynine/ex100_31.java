package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_31 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = 'D';
		switch(score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
			case 7:
				grade = 'B';
				break;
			case 6:
			case 5:
			case 4:
				grade = 'C';
		}
		System.out.println(grade);
		scan.close();
	}
	
}
