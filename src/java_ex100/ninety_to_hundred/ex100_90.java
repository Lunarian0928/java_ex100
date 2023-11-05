package java_ex100.ninety_to_hundred;

import java.util.Scanner;
import java.util.Stack;
public class ex100_90 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < 10; i++) {
			stack.add(scan.nextInt());
		}
		
		while (!stack.isEmpty()) {
			System.out.printf("%d ", stack.pop());
		}
		System.out.println();
		scan.close();
	}

}
