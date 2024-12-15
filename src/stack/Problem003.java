package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 3. 크레인 인형뽑기
 */
public class Problem003 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		int n = knb.nextInt();
		List<Stack> stackList = new ArrayList<>();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
                arr[i][j] = knb.nextInt();
            }
		}
		for (int i = 0; i < n; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = 0; j < n; j++)
			{
				if (arr[n-j-1][i] != 0) stack.push(arr[n-j-1][i]);
			}
			stackList.add(stack);
		}
		int m = knb.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
            moves[i] = knb.nextInt();
        }
		System.out.println(solution(stackList, moves, n, m));
	}

	public static int solution(List<Stack> stackList, int[] moves, int n, int m) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
			if (stackList.get(moves[i]-1).isEmpty()) continue;
			Integer pop = (Integer) stackList.get(moves[i] - 1).pop();
			if (!stack.isEmpty() && stack.peek() == pop) {
				stack.pop();
				result+=2;
			} else {
				stack.push(pop);
			}
		}

		if (!stack.isEmpty()) {
			Integer pop = stack.pop();
			if (!stack.isEmpty() && stack.peek() == pop) {
				result += 2;
			}
		}

		return result;
    }
}
