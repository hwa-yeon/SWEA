package swea;

import java.util.Scanner;

public class p2005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			System.out.println("#" + t);
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					if(i == 0) arr[i][j] = 1;
					else if(j == 0) arr[i][j] = 1;
					else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
