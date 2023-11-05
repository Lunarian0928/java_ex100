package java_ex100.eighty_to_eightynine;

import java.util.Scanner;

public class ex100_80 {
	
	static void printAnswer(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				c -= 3;
				if (c < 65) {
					c += 26;
				}
			}
			else if (Character.isLowerCase(c)) {
				c -= 3;
				if (c < 97) {
					c += 26;
				}
			}
			answer += c;
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printAnswer(str);
		scan.close();
	}
	
}