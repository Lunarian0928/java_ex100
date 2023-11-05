package java_ex100.ninety_to_hundred;

import java.util.Scanner;

public class ex100_93 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[7];
		String str = scan.nextLine();
		
		arr = str.split(" ");
		
		try {
			Thread.sleep(3000);
			for (int i = 0; i < 30; i++) {
				System.out.println(".");
			}
		} catch(Exception e) {
			System.out.println("에러");
		}
		
		int k = scan.nextInt();
		System.out.println(arr[k - 1]);
		scan.close();
	}

}
