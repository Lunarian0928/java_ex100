package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = 'F';
		switch(score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
		}
		System.out.println(grade);
		scan.close();
	}
	
}
