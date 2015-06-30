import java.util.Arrays;
import java.util.Scanner;

public class Queue490B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// Student student[] = new Student[n];
		int after[] = new int[1000001];
		boolean exist[] = new boolean[1000001];
		Arrays.fill(after, -1);
		int front[] = new int[1000001];
		Arrays.fill(front, -1);
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			exist[a] = true;
			exist[b] = true;
			after[a] = b;
			front[b] = a;
		}
		int result[] = new int[n + 1];
		int current = 0;
		int index = 1;
		while (after[current] != 0 && after[current] != -1) {
			result[index] = after[current];
			current = after[current];
			index += 2;
		}
		index = 0;
		current = 0;
		for (int i = 1; i <= 1000000; ++i) {
			if (exist[i] && front[i] == -1) {
				current = i;
				break;
			}
		}

		while (current != 0 && current != -1) {
			result[index] = current;
			current = after[current];
			index += 2;
		}
		StringBuilder str = new StringBuilder();
		str.append(result[0]);
		for (int i = 1; i < n; ++i) {
			str.append(" " + result[i]);
		}
		System.out.println(str);
	}
}

class Student implements Comparable<Student> {
	int front;
	int behind;

	public Student(int a, int b) {
		front = a;
		behind = b;
	}

	@Override
	public int compareTo(Student arg0) {

		return front - arg0.front;
	}
}