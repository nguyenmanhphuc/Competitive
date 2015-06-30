import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B471 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Task[] tasks = new Task[n];
		boolean possible = false;
		Map<Integer, Integer> taskDifficult = new HashMap<Integer, Integer>();
		int count2 = 0;
		for (int i = 0; i < n; ++i) {
			int difficult = in.nextInt();
			tasks[i] = new Task(i + 1, difficult);
			Integer existTasks = taskDifficult.get(difficult);
			if (existTasks == null) {
				taskDifficult.put(difficult, 1);
			} else {
				taskDifficult.put(difficult, existTasks + 1);
				if (existTasks == 1) {
					count2++;
					possible = count2 > 1 ? true : false;
				} else {
					possible = true;
				}
			}
		}
		if (!possible) {
			System.out.println("NO");
			return;
		}
		Arrays.sort(tasks);
		StringBuilder str = new StringBuilder();
		int curDiff = 0;
		int count = 0;
		System.out.println("YES");
		str.append(tasks[0].index);
		for (int j = 1; j < n; ++j) {
			str.append(' ');
			str.append(tasks[j].index);
		}
		str.append('\n');
		int countLines = 1;
		for (int i = 0; i < n; ++i) {
			Integer difficult = taskDifficult.get(tasks[i].difficult);
			if (difficult >= 2) {
				Task task = tasks[i];
				tasks[i] = tasks[i + 1];
				tasks[i + 1] = task;
				str.append(tasks[0].index);
				for (int j = 1; j < n; ++j) {
					str.append(' ');
					str.append(tasks[j].index);
				}
				str.append('\n');
				countLines++;
				if (countLines > 2) {
					System.out.println(str);
					return;
				}
				if (difficult == 2) {
					while (tasks[i + 1].difficult == tasks[i].difficult) {
						i++;
					}
				}

				else {

					task = tasks[i];
					tasks[i] = tasks[i + 2];
					tasks[i + 2] = task;

					str.append(tasks[0].index);
					for (int j = 1; j < n; ++j) {
						str.append(' ');
						str.append(tasks[j].index);
					}
					System.out.println(str);
					return;
				}
			}

		}
	}
}

class Task implements Comparable<Task> {
	int index;
	int difficult;

	public Task(int index, int difficult) {
		super();
		this.index = index;
		this.difficult = difficult;
	}

	@Override
	public int compareTo(Task task) {
		return Integer.compare(this.difficult, task.difficult);
	}
}
