package Recursion;

import java.util.*;

public class RatInMazeUsingRecursion {

	public static ArrayList<String> findPath(int[][] m, int n) {

		ArrayList<String> array = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		int[][] visited = new int[n][n];
		visited[0][0] = 1;
		solver(0, 0, m, s, visited, array);
		return array;

	}

	private static void solver(int i, int j, int[][] m, StringBuilder s, int[][] visited, ArrayList<String> array) {

		if (i == m.length - 1 && j == m.length - 1) {
			array.add(s.toString());
			return;
		}

		// down
		if (i + 1 < m.length && visited[i + 1][j] == 0 && m[i + 1][j] == 1) {

			visited[i + 1][j] = 1;
			s.append('D');
			solver(i + 1, j, m, s, visited, array);
			s.deleteCharAt(s.length() - 1);
			visited[i + 1][j] = 0;
		}

		// left
		if (j - 1 >= 0 && visited[i][j-1] == 0 && m[i][j-1] == 1) {

			visited[i][j-1] = 1;
			s.append('L');
			solver(i, j-1, m, s, visited, array);
			s.deleteCharAt(s.length() - 1);
			visited[i][j-1] = 0;
		}

		// right
		if (j +1 <m.length && visited[i][j+1] == 0 && m[i][j+1] == 1) {

			visited[i][j+1] = 1;
			s.append('R');
			solver(i, j+1, m, s, visited, array);
			s.deleteCharAt(s.length() - 1);
			visited[i][j+1] = 0;
		}
		// up
		if (i-1 >=0 && visited[i-1][j] == 0 && m[i-1][j] == 1) {

			visited[i-1][j] = 1;
			s.append('U');
			solver(i-1, j, m, s, visited, array);
			s.deleteCharAt(s.length() - 1);
			visited[i-1][j] = 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();

			RatInMazeUsingRecursion obj = new RatInMazeUsingRecursion();
			ArrayList<String> res = obj.findPath(a, n);
			Collections.sort(res);
			if (res.size() > 0) {
				for (int i = 0; i < res.size(); i++)
					System.out.print(res.get(i) + " ");
				System.out.println();
			} else {
				System.out.println(-1);
			}
		}

	}

}
