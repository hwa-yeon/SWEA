package swea;

import java.util.Scanner;

public class p1859 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
						
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = arr[N - 1];
			long result = 0;
			for(int i = N - 2; i >= 0; i--) {
				if(arr[i] > max) {
					max = arr[i];
				}
				else {
					result += max - arr[i];
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}

}
