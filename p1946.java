package swea;

import java.util.Scanner;

public class p1946 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			char[] C = new char[N];
			int[] K = new int[N];
			for(int i = 0; i < N; i++) {
				C[i] = sc.next().charAt(0);
				K[i] = sc.nextInt();
			}
			System.out.println("#" + t);
			
			int count = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < K[i]; j++) {
					if(count == 10) {
						System.out.println();
						count = 0;
					}
					
					System.out.print(C[i]);
					count++;
				}
			}
			System.out.println();
		}
	}

}

