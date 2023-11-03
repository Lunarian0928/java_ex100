package java_ex100.twenty_to_twentynine;

import java.util.Scanner;

public class ex100_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		int i3 = scan.nextInt();
		long sum = i1 + i2 + i3;
		float average = sum / 3;
		System.out.println(sum);
		System.out.printf("%.2f", average);
		scan.close();
	}

}
