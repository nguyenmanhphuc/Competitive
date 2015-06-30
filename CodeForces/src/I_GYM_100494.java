import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class I_GYM_100494 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int a = in.nextInt();

		List<Integer>[] listIndices = new List[c];

		for (int i = 0; i < c; ++i) {
			listIndices[i] = new ArrayList<Integer>();
		}

		int[] arr = new int[a];
		for (int i = 0; i < a; ++i) {
			arr[i] = in.nextInt();
			listIndices[arr[i]].add(i);
		}

		for (int i = 0; i < c; ++i) {
			listIndices[i].add(a);
		}

		int[] index = new int[c];

		boolean[] used = new boolean[c];

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int size = 0;
		int count = 0;
		for (int i = 0; i < a; ++i) {
			if (used[arr[i]]) {
				index[arr[i]]++;
				q.add(-listIndices[arr[i]].get(index[arr[i]]));
				continue;
			}
			used[arr[i]] = true;
			index[arr[i]]++;

			if (size == n) {
				int temp = -q.poll();
				if (temp < a) {
					used[arr[temp]] = false;
				}
			} else {
				size++;
			}
			q.add(-listIndices[arr[i]].get(index[arr[i]]));
			count++;
		}

		System.out.println(count);
	}
}
