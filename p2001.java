package swea;

import java.util.Scanner;

public class p2001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			int[][] sum = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
					
					if(i == 0 && j == 0) sum[i][j] = arr[i][j];
					else if(i == 0) sum[i][j] = arr[i][j] + sum[i][j-1];
					else if(j == 0) sum[i][j] = arr[i][j] + sum[i-1][j];
					else sum[i][j] = arr[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
				}
			}
			int max = 0;
			for(int i = M -1; i < N; i++) {
				for(int j = M -1; j < N; j++) {
					int result = sum[i][j];
					if(i >= M) result -= sum[i-M][j];
					if(j >= M) result -= sum[i][j-M];
					if(i >= M && j >= M) result += sum[i-M][j-M];
					max = Math.max(max, result);
				}
			}
			System.out.println("#" + t + " " + max);
		}
	}

}
