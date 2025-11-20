package swea;

import java.util.Scanner;

public class p1926 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int n = 1; n <= N; n++) {
			int count = 0;
			
			if(check(n / 100)) count++;
			if(check(n / 10)) count++;
			if(check(n % 10)) count++;
			
			if(count == 0) System.out.print(n + " ");
			else {
				for(int i = 0; i < count; i++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}
	
	private static boolean check(int num) {
		if(num == 3 || num == 6 || num == 9) return true;
		return false;
	}

}
