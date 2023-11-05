package java_ex100.ninety_to_hundred;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex100_97 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		
		ArrayList<Integer> height = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			height.add(scan.nextInt());
		}
		
		Collections.sort(height);
		
		for (int i = 0; i < N; i += C) {
			for (int j = i; j < N && j < i + C; j++) {
				System.out.printf("%d ", height.get(j));
			}
			System.out.println();
		}
		
		scan.close();
	}
	

}