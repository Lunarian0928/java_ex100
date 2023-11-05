package java_ex100.ninety_to_hundred;

import java.util.Scanner;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ex100_91 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			deque.addLast(scan.nextInt());
		}
	
		for (int i = 0; i < n; i++) {
			Iterator<Integer> it = deque.iterator();
			while (it.hasNext()) {
				System.out.printf("%d ", it.next());
			}
			System.out.println();
			
			int value = deque.pollFirst();
			deque.addLast(value);
		}
		
		scan.close();
	}

}
