import java.util.Arrays;
import java.util.Scanner;

public class A166 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Team[] teams = new Team[n];
		for (int i = 0; i < n; ++i) {
			teams[i] = new Team(in.nextInt(), in.nextInt());
		}
		Arrays.sort(teams);
		Team t = teams[k - 1];
		int lower = lowerBound(teams, t);
		int upper = upperBound(teams, t);
		System.out.println(lower - upper + 1);
	}

	public static int upperBound(Team[] arr, Team value) {
		int right = arr.length - 1;
		int left = 0;
		if (arr[right].compareTo(value) < 0) {
			return -1;
		}

		while (right != left) {
			int mid = (right + left) >> 1;
			if (arr[mid].compareTo(value) >= 0) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		if (arr[right].compareTo(value) >= 0) {
			return left;
		}
		return left + 1;
	}

	public static int lowerBound(Team[] arr, Team value) {
		int right = arr.length - 1;
		int left = 0;
		if (arr[0].compareTo(value) > 0) {
			return -1;
		}

		while (right != left) {
			int mid = (right + left + 1) >> 1;
			if (arr[mid].compareTo(value) <= 0) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		if (arr[right].compareTo(value) <= 0) {
			return left;
		}
		return left - 1;
	}

}

class Team implements Comparable<Team> {
	int p;
	int total;

	public Team(int p, int total) {
		super();
		this.p = p;
		this.total = total;
	}

	@Override
	public int compareTo(Team team) {
		if (this.p != team.p) {
			return -this.p + team.p;
		}

		return this.total - team.total;
	}
}