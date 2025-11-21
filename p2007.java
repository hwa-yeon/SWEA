package swea;

import java.util.Scanner;

public class p2007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t = 1; t <= T; t++) {
			String str = sc.nextLine();
			
			int answer = 0;
			boolean find;
			for(int length = 1; length <= 10; length++) {
				String sub = str.substring(0, length);
				find = true;
				
				for(int i = 0; i < 30; i++) {
					if(str.charAt(i) != sub.charAt(i % length)) {
						find = false;
						break;
					}
				}
				
				if(find) {
					answer = length;
					break;
				}
			}
			System.out.println("#" + t + " " + answer);
		}
	}

}
