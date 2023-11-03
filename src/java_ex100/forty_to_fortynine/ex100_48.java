package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_48 {
	public static void printAge(int birth, int gender) {
		int year = 2023;
		int age = year;
		switch(gender) {
			case 1:
			case 2:
				age -= 1900;
				break;
			case 3:
			case 4:
				age -= 2000;
		}
		age -= (birth / 10000 - 1);

		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birth = scan.nextInt();
		int gender = scan.nextInt();
		printAge(birth, gender);
		scan.close();
	}
	
}
