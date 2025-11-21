package swea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p1983 {
	
	static class Student {
		int id;
		int grade;
		
		Student(int id, int grade) {
			this.id = id;
			this.grade = grade;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			ArrayList<Student> students = new ArrayList<>();
			for(int i = 0; i < N; i++) {
				int exam1 = sc.nextInt();
				int exam2 = sc.nextInt();
				int work = sc.nextInt();
				
				students.add(new Student(i, exam1 * 35 + exam2 * 45 + work * 20));
			}
			students.sort((a, b) -> b.grade - a.grade);
			
			for(int i = 0; i < N; i++) {
				if(students.get(i).id == K-1) {
					System.out.print("#" + t + " ");
					if(i < N/10) System.out.println("A+");
					else if(i < N/10*2) System.out.println("A0");
					else if(i < N/10*3) System.out.println("A-");
					else if(i < N/10*4) System.out.println("B+");
					else if(i < N/10*5) System.out.println("B0");
					else if(i < N/10*6) System.out.println("B-");
					else if(i < N/10*7) System.out.println("C+");
					else if(i < N/10*8) System.out.println("C0");
					else if(i < N/10*9) System.out.println("C-");
					else System.out.println("D0");
				}
			}
		}
	}

}
