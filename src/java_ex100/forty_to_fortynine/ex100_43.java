package java_ex100.forty_to_fortynine;

import java.util.Scanner;

public class ex100_43 {
	static char getDigitChar(String s) {
		char c = '\0';
		switch (s) {				
			case "1":
				c = '일';
				break;
			case "2":
				c = '이';
				break;
			case "3":
				c = '삼';
				break;
			case "4":
				c = '사';
				break;
			case "5":
				c = '오';
				break;
			case "6":
				c = '육';
				break;
			case "7":
				c = '칠';
				break;
			case "8":
				c = '팔';
				break;
			case "9":
				c = '구';
				break;
		}
		return c;
	}
	static char getUnit(int length, int i) {
		switch (length - i) {
			case 5:
				return('만');
			case 4:
				return('천');
			case 3:
				return('백');
			case 2:
				return('십');
			default:
				return('\0');
		}
		
	}
	
	static void printToString(int n) {
		String str = Integer.toString(n);
		int length = str.length();
		
		int i = 0;
		for (String s : str.split("")) {
			char digitChar = getDigitChar(s); 
			if (digitChar != '\0') {
				System.out.printf("%c", digitChar);
				char unit = getUnit(length, i);
				if (unit != '\0') {
					System.out.printf("%c", unit);
				}
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printToString(n);
		scan.close();
	}
	
}
