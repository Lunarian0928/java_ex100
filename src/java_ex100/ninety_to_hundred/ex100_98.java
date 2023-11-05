package java_ex100.ninety_to_hundred;

import java.util.Scanner;

public class ex100_98 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[][] arr = new boolean[10][10];
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			arr[x - 1][y - 1] = true;
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", arr[i][j] == true ? 1 : 0);
			}
			System.out.println();
		}
		
		scan.close();
	}
	

}