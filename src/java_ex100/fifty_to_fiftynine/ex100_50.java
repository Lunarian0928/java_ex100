package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_50 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float BMI = scan.nextFloat();
		String answer = "";
		if (BMI < 18.5) {
			answer = "저체중";
		} else if (BMI >= 18.5 && BMI <= 23) {
			answer = "정상체중";
		} else {
			answer ="과체중";
		}
		System.out.println(answer);
		scan.close();
	}
	
}