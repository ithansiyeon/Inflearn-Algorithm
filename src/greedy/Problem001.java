package greedy;

import java.util.*;

class Body implements Comparable<Body>{
	public int h, w;

	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}


	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}

public class Problem001 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(new Body(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(solution(n, arr));
	}

	public static int solution(int n, ArrayList<Body> arr) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for (Body object : arr) {
			if (object.w > max) {
				max = object.w;
				cnt++;
			}
		}
		return cnt;
	}
}
