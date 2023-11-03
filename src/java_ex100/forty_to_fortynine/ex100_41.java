package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_41 {
	static void printJudge(float range) {
		String judge = "lose";
		if ((range >= 30 && range <= 40) || (range >= 60 && range <= 70)){
			judge = "true";
		} 
		System.out.println(judge);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		printJudge(range);
		scan.close();
	}
	
}
