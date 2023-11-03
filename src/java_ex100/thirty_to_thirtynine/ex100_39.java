package java_ex100.thirty_to_thirtynine;

import java.util.Scanner;

public class ex100_39 {
	
	static int getSmaller(int n1, int n2) {
		return (n1 < n2 ? n1 : n2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(getSmaller(c, getSmaller(a , b)));
		scan.close();
	}
	
}
