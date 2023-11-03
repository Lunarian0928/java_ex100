package java_ex100.ten_to_nineteen;

import java.util.Scanner;

public class ex100_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		System.out.printf("%d:%d", hour, minute);
		scan.close();
	}

}
