package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_56 {
	static void printAnswer(int[] arr) {
		int one_cnt = 0;
		for (int i = 0; i < 4; i++) {
			if (arr[i] == 1)
				one_cnt++;
		}
		
		char c = '모';
		switch(one_cnt) { 
			case 1:
				c = '도';
				break;
			case 2:
				c = '개';
				break;
			case 3:
				c = '걸';
				break;
			case 4:
				c = '웇';
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] yut = new int[4];
		for (int i = 0; i < 4; i++) {
			yut[i] = scan.nextInt();
		}
		printAnswer(yut);
		scan.close();
	}
	
}
