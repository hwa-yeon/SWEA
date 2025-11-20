package swea;

import java.util.Scanner;

public class p1204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int test = sc.nextInt();
			
			int[] score = new int[101];
			for(int i = 0; i < 1000; i++) {
				int num = sc.nextInt();
				score[num]++;
			}
			
			int frequency = 0;
			int max = 0;
			for(int i = 0; i <= 100; i++) {
				if(score[i] >= frequency) {
					frequency = score[i];
					max = i;
				}
			}
			
			System.out.println("#" + test + " " + max);
		}
	}

}
