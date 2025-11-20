package swea;

import java.util.Scanner;

public class p1954 {

	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int [][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			arr = new int[N][N];
			visited = new boolean[N][N];
			
			BFS(0, 0, N);
			
			System.out.println("#" + t);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	private static void BFS(int y, int x, int N) {
		arr[0][0] = 1;
		visited[0][0] = true;
		
		int yNow = 0;
		int xNow = 0;
		int direction = 0;
		for(int i = 2; i <= N * N; i++) {
			if(!check(yNow + dy[direction], xNow + dx[direction], N)) direction++;
			if(direction == 4) direction = 0;

			yNow += dy[direction];
			xNow += dx[direction];
			arr[yNow][xNow] = i;
			visited[yNow][xNow] = true;
		}
	}
	
	private static boolean check(int y, int x, int N) {
		if(y < 0 || x < 0 || y >= N || x >= N) return false;
		if(visited[y][x]) return false;
		return true;
	}

}
