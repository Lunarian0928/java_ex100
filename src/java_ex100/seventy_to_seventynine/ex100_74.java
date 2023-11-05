package java_ex100.seventy_to_seventynine;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class ex100_74 {
	static void printAnswer(int N, TreeSet<Integer> set) {
		for (int i = 1; i <= (int)Math.sqrt(N); i++) {
			if (N % i == 0) {
				set.add(i);
				set.add(N / i);
			}
		}
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.printf("%d ", iter.next());
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		printAnswer(N, set);
		scan.close();
	}
	
}