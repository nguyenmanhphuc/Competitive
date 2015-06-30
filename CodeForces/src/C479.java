import java.util.Arrays;
import java.util.Scanner;

public class C479 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Exam[] exams = new Exam[n];
		for (int i = 0; i < n; ++i) {
			exams[i] = new Exam(in.nextInt(), in.nextInt());
		}
		int pre = -1;
		Arrays.sort(exams);
		for (int i = 0; i < n; ++i) {
			if (exams[i].b >= pre) {
				pre = exams[i].b;
			} else {
				pre = exams[i].a;
			}
		}
		System.out.println(pre);
	}
}

class Exam implements Comparable<Exam> {

	public Exam(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	int a;
	int b;

	@Override
	public int compareTo(Exam e) {

		if (this.a != e.a) {
			return Integer.compare(this.a, e.a);
		}
		return Integer.compare(this.b, e.b);
	}
}
