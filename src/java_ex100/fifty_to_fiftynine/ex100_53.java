package java_ex100.fifty_to_fiftynine;

import java.util.Scanner;

public class ex100_53 {
	static int plus(int a, int b) {
		return a + b; 
	}
	static int minus(int a, int b) {
		return (a > b ? a - b : b - a);
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return (a > b ? a / b : b / a);
	}
	static int pow(int a, int b) {
		int pow1 = (int)Math.pow(a, b);
		int pow2 = (int)Math.pow(b, a);
		return (pow1 > pow2 ? pow1 : pow2);
	}
	
	static void printAnswer(int n1, int n2) {
		int max = plus(n1, n2);
		if (minus(n1, n2) > max) {
			max = minus(n1, n2);
		}
		if (multiply(n1, n2) > max) {
			max = multiply(n1, n2);
		}
		if (divide(n1, n2) > max) {
			max = divide(n1, n2);
		}
		if (pow(n1, n2) > max) {
			max = pow(n1, n2);
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		printAnswer(a, b);
		scan.close();
	}
	
}
