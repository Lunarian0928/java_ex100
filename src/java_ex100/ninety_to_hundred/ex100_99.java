package java_ex100.ninety_to_hundred;

import java.util.Scanner;

public class ex100_99 {
	static void printGrade(int score) {
		char grade = 'E';
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
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		printGrade(score);
		scan.close();
	}
	

}