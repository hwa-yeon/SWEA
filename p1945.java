package swea;

import java.util.Scanner;

public class p1945 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] sosu = {2, 3, 5, 7, 11};
		
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] count = new int[5];
			for(int i = 0; i < 5; i++) {
				while(N % sosu[i] == 0) {
					count[i]++;
					N /= sosu[i];
				}
			}
			System.out.print("#" + t);
			for(int i = 0; i < 5; i++) {
				System.out.print(" " + count[i]);
			}
			System.out.println();
		}
	}

}
