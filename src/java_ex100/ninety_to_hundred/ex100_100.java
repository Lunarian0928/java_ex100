package java_ex100.ninety_to_hundred;

import java.util.Scanner;
import java.util.Random;

public class ex100_100 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		int cpuNum = rand.nextInt(100) + 1;
		System.out.println(cpuNum);
		int num = 0;
		while (num != cpuNum) {
			num = scan.nextInt();
			
			String judge = "equal";
			if (num > cpuNum) {
				judge = "bigger";
			} else if (num < cpuNum) {
				judge = "smaller";
			}
			System.out.println(judge);
		} 
		scan.close();
	}

}