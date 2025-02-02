package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 7. 좌표 정렬
 */

class Point implements Comparable<Point> {
	public int x, y;
	Point (int x, int y) {
		this.x = x;
        this.y = y;
	}

    @Override
    public int compareTo(Point o) {
		if (this.x == o.x) return this.y - o.y;
		return this.x - o.x;
	}
}

public class Problem007_1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for (Point p : arr) {
			System.out.println(p.x + " " + p.y);
		}
	}
}
