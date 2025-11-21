package swea;

import java.util.Scanner;

public class p1979 {
	
	static int[][] arr;
	static int N;
	static int K;
	static int count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			N = sc.nextInt();
			K = sc.nextInt();
			count = 0;
			arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 1) {
						if(j == 0 || arr[i][j-1] == 0) width(i, j, 0);
						if(i == 0 || arr[i-1][j] == 0) height(i, j, 0);
					}
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
	
	private static void width(int y, int x, int depth) {
		if(x >= N || arr[y][x] == 0) {
			if(depth == K) count++;
			return;
		}
		width(y, x+1, depth+1);
	}
	
	private static void height(int y, int x, int depth) {
		if(y >= N || arr[y][x] == 0) {
			if(depth == K) count++;
			return;
		}
		height(y+1, x, depth+1);
	}

}
