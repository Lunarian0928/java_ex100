package java_ex100.ninety_to_hundred;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ex100_96 {
	static class ScoreInfo {
		String name;
		int score;
		
		ScoreInfo(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}
	
	static class ScoreComparator implements Comparator<ScoreInfo> {
	    public int compare(ScoreInfo s1, ScoreInfo s2) {
	        if (s1.score > s2.score) return 1;
	        else if (s1.score < s2.score) return -1;
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<ScoreInfo> arr = new ArrayList<ScoreInfo>();		
		for (int i = 0; i < n; i++) {
			String name = scan.nextLine();
			int score = scan.nextInt();
			scan.nextLine();
			ScoreInfo scoreInfo = new ScoreInfo(name, score);
			arr.add(scoreInfo);
		}
		
		Collections.sort(arr, new ScoreComparator());
		System.out.println(arr.get(2).name);
		scan.close();
	}
	

}