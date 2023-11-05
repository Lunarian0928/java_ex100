package java_ex100.eighty_to_eightynine;

import java.util.Scanner;
import java.util.TreeSet;
public class ex100_81 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < 5; i++) {
			set.add(scan.nextInt());
		}
		
		System.out.println(set.last());
		System.out.println(set.first());
		scan.close();
	}
	
}