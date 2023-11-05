package java_ex100.seventy_to_seventynine;

import java.util.Scanner;

public class ex100_73 {
	static void makeArray(int[] arr) {
		int value = 1;
		for (int i = 0; i < 24; i+= 2) {
			arr[i] = value;
			arr[i + 1] = 10 * (value);
			value++;
		}
	}
	
	static void printAnswer(int[] arr, int k, int h) {
		System.out.println(arr[k - 1] + arr[h - 1]);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[24];
		makeArray(arr);
		
		int k = scan.nextInt();
		int h = scan.nextInt();
		printAnswer(arr, k, h);
		scan.close();
	}
	
}