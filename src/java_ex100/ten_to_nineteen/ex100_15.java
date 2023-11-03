package java_ex100.ten_to_nineteen;

import java.util.Scanner;

public class ex100_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		System.out.printf("%d.%02d.%02d", year, month, day);
		scan.close();
	}

}
