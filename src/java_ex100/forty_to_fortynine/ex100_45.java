package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_45 {
	
	static void printAnswer(int a, int b, int c) {
		// 분모
		int denominator = 2 * a;
		// 분자
		int numerator1 = -b;
		// 판별식
		double d = b * b - 4 * a * c;
		
		if (d == 0) {
			System.out.printf("방정식의 해는 %.2f\n", numerator1 / denominator);
		} else if (d > 0){
			double numerator2 = Math.sqrt(d);
			System.out.printf("방정식의 해는 %.2f\n", (numerator1 + numerator2) / denominator);
			System.out.printf("방정식의 해는 %.2f\n", (numerator1 - numerator2) / denominator);
		} else {
			System.out.printf("실근이 없습니다.\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		printAnswer(a, b, c);
		scan.close();
	}
	
}
