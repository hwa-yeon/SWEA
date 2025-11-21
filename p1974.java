package swea;

import java.util.Scanner;

public class p1974 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int[][] arr = new int[9][9];

			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			boolean result = checkLines(arr) && 
					checkSquare(arr, 0, 0) && checkSquare(arr, 3, 0) && checkSquare(arr, 6, 0) &&
					checkSquare(arr, 3, 0) && checkSquare(arr, 3, 3) && checkSquare(arr, 3, 6) &&
					checkSquare(arr, 6, 0) && checkSquare(arr, 6, 3) && checkSquare(arr, 6, 6);
			if(result) System.out.println("#" + t + " " + 1);
			else System.out.println("#" + t + " " + 0);
		}
	}
	
	static boolean checkLines(int[][] arr) {
		for(int i = 0; i < 9; i++) {
			int[] chk = new int[10];
			for(int j = 0; j < 9; j++) {
				chk[arr[i][j]]++;
			}
			for(int k = 1; k <= 9; k++) {
				if(chk[k] == 0 || chk[k] > 1) return false;
			}
		}
		for(int j = 0; j < 9; j++) {
			int[] chk = new int[10];
			for(int i = 0; i < 9; i++) {
				chk[arr[i][j]]++;
			}
			for(int k = 1; k <= 9; k++) {
				if(chk[k] == 0 || chk[k] > 1) return false;
			}
		}
		return true;
	}
	
	static boolean checkSquare(int[][] arr, int n, int m) {
		int[] chk = new int[10];
		for(int i = n; i < n+3; i++) {
			for(int j = m; j < m+3; j++) {
				chk[arr[i][j]]++;
			}
		}
		for(int k = 1; k <= 9; k++) {
			if(chk[k] == 0 || chk[k] > 1) return false;
		}
		return true;
	}

}
