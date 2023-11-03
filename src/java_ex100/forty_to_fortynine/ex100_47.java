package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_47 {
	static void printAnswer(int year) {
		String comment = "no";
		if (year % 4 == 0 && year % 100 != 0)
			comment = "yes"; 
		else if (year % 400 == 0)
			comment = "yes";
		System.out.println(comment);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		printAnswer(year);
		scan.close();
	}
	
}
