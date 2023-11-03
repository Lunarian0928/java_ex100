package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_44 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String comment = "enjoy";
		switch(n) {
			case 1:
			case 3:
			case 5:
			case 7:
				comment = "oh my god";
		}
		System.out.println(comment);
		scan.close();
	}
	
}
