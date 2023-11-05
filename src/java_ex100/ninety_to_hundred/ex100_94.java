package java_ex100.ninety_to_hundred;

import java.util.Scanner;

public class ex100_94 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String brackets = scan.nextLine();
		int openCnt = 0;
		int closeCnt = 0;
		for (int i = 0; i < brackets.length(); i++) {
			if (brackets.charAt(i) == '(') {
				openCnt++;
			} else {
				closeCnt++;
			}
		}
		System.out.printf("%d %d\n", openCnt, closeCnt);
		
		scan.close();
	}

}