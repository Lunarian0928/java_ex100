package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_32 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		String comment = "what?";
		switch(grade) {
			case "A":
				comment = "best!!!";
				break;
			case "B":
				comment = "good!!";
				break;
			case "C":
				comment = "run!";
				break;
			case "D":
				comment = "slowly~";
		}
		System.out.println(comment);
		scan.close();
	}
	
}
