package swea;

import java.util.Scanner;

public class p21425 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			
			int count = 0;
			while(true) {
				if(A > N || B > N) break;
				
				if(A >= B) {
					B += A;
					count++;
				}
				else {
					A += B;
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
