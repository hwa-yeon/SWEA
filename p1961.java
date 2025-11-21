package swea;

import java.util.Scanner;

public class p1961 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int[][] arr90 = locate90(arr, N);
			int[][] arr180 = locate90(arr90, N);
			int[][] arr270 = locate90(arr180, N);
			
			System.out.println("#" + t);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(arr90[i][j]);
				}
				System.out.print(" ");
				for(int j = 0; j < N; j++) {
					System.out.print(arr180[i][j]);
				}
				System.out.print(" ");
				for(int j = 0; j < N; j++) {
					System.out.print(arr270[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	private static int[][] locate90(int[][] arr, int N) {
		int[][] result = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				result[i][j] = arr[N-j-1][i];
			}
		}
		return result;
	}

}
