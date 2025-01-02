package stack;

import java.util.*;

/**
 * 8. 응급실
 */
class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Problem008 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		int n = knb.nextInt(), m = knb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = knb.nextInt();
		}
		System.out.println(solution(n, m, arr));
	}

	public static int solution(int n, int m, int[] arr) {
		int ans = 0;
		Queue<Person> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, arr[i]));
		}

		while (!queue.isEmpty()) {
			Person person = queue.poll();
			for (Person x : queue) {
				if (person.priority < x.priority) {
					queue.offer(person);
					person = null;
					break;
				}
			}
			if (person != null) {
				ans++;
				if (person.id == m) return ans;
			}
		}
		return ans;
	}
}
