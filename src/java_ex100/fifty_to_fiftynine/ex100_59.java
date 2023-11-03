package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_59 {
	
	static void checkWinningNum(int[] winningNum, int[] lottoNum) {
		int length = winningNum.length;
		for (int i = 0; i < length - 1; i++) {
			lottoNum[winningNum[i] - 1] = 1;
		}
		lottoNum[length - 1] = 2;
	}
	
	static int getRanking(int[] myNum, int[] lottoNum) {
		int win_cnt = 0;
		boolean bonus = false;
		
		for (int i = 0; i < myNum.length; i++) {
			if (lottoNum[myNum[i] - 1] > 0) {
				win_cnt++;
				if (lottoNum[myNum[i] - 1] > 1) {
					bonus = !bonus;
				}
			} 
		}
		
		int ranking = 0;
		switch(win_cnt) {
			case 6:
				ranking = 1;
				break;
			case 5:
				ranking = 3;
				break;
			case 4:
				ranking = 4;
				break;
			case 3:	
				ranking = 5;
		}
		if (ranking == 3 && bonus == true) {
			ranking -= 1;
		}
		return ranking;
	}
	
	static void printAnswer(int[] lottoNum, int[] winningNum, int[] myNum) {
		checkWinningNum(winningNum, lottoNum);
		System.out.println(getRanking(myNum, lottoNum));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lottoNum = new int[45];
		int[] winningNum = new int[7];
		int[] myNum = new int[6];
		
		for (int i = 0; i < winningNum.length; i++) {
			winningNum[i] = scan.nextInt();
		}
		for (int i = 0; i < myNum.length; i++) {
			myNum[i] = scan.nextInt();
		}
		printAnswer(lottoNum, winningNum, myNum);
		
		scan.close();
	}
	
}
