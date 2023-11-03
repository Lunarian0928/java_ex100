package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_33 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season = "";
		switch(month) {
			case 12:
			case 1:
			case 2:
				season = "winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "fall"; 
		}
		System.out.println(season);
		scan.close();
	}
	
}
