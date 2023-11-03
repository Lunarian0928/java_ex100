package java_ex100.sixty_to_sixtynine;

import java.util.Scanner;

public class ex100_61 {
	static void printAnswer(int operand1, int operand2, String operator) {
		switch(operator) {
			case "+":
				System.out.printf("%d", operand1 + operand2);
				break;
			case "-":
				System.out.printf("%d", operand1 - operand2);
				break;
			case "*":
				System.out.printf("%d", operand1 * operand2);
				break;
			case "/":
				System.out.printf("%.2f", operand1 / operand2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operand1 = scan.nextInt();
		scan.nextLine();
		String operator = scan.nextLine();
		int operand2 = scan.nextInt();
		printAnswer(operand1, operand2, operator);
		
		scan.close();
	}
	
}