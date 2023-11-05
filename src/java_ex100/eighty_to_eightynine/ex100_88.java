package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
public class ex100_88 {
	static int getSeqNum(int n) {
		if (n == 1) return 1;
		return n + getSeqNum(n - 1);
	}
	static int getSeqSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += getSeqNum(i);
		}
		return sum;
	}
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(getSeqSum(n));
		scan.close();
	}
	
}