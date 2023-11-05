package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_79 {
	
	static void printAnswer(String s) {
		String answer = "";
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) 
				answer += Character.toLowerCase(c);
			else {
				answer += Character.toUpperCase(c);
			}
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		printAnswer(s);
		scan.close();
	}
	
}