package swea;

import java.util.Scanner;

public class p1989 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t = 1; t <= T; t++) {
			String input = sc.nextLine();
			String reverse = new StringBuilder(input).reverse().toString();
			
			int result;
			if(input.equals(reverse)) result = 1;
			else result = 0;
			
			System.out.println("#" + t + " " + result);
		}
	}

}
