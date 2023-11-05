package java_ex100.ninety_to_hundred;

import java.util.Scanner;

public class ex100_95 {
	
	static void printAnswer(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 97 && c <= 122) {
				arr[c - 97]++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c:%d\n", i + 97, arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		printAnswer(s);
	
		scan.close();
	}

}