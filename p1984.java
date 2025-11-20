package swea;

import java.util.Arrays;
import java.util.Scanner;

public class p1984 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int arr[] = new int[10];
			for(int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			double sum = 0;
			for(int i = 1; i <= 8; i++) {
				sum += arr[i];
			}
			System.out.println("#" + t + " " + Math.round(sum / 8));
		}
	}

}
