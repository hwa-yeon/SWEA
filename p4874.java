package swea;

import java.util.Scanner;
import java.util.Stack;

public class p4874 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t = 1; t <= T; t++) {
			Stack<Integer> stack = new Stack<>();
			boolean avail = true;
			
			String str = sc.nextLine();
			String[] tokens = str.split(" ");
			for(String token : tokens) {
				if(token.equals(".")) break;
				
				if(isNum(token)) {
					stack.push(Integer.parseInt(token));
				}
				else {
					if(stack.isEmpty()) {
						avail = false;
						break;
					}
					int num2 = stack.pop();
					
					if(stack.isEmpty()) {
						avail = false;
						break;
					}
					int num1 = stack.pop();
					
					int result = cal(token, num1, num2);
					stack.push(result);
				}
			}
			
			if(avail) System.out.println("#" + t + " " + stack.pop());
			else System.out.println("#" + t + " error");
		}
	}
	
	private static boolean isNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	private static int cal(String str, int num1, int num2) {
		if(str.equals("+")) return num1 + num2;
		else if(str.equals("-")) return num1 - num2;
		else if(str.equals("*")) return num1 * num2;
		else if(str.equals("/")) return num1 / num2;
		
		return 0;
	}

}
