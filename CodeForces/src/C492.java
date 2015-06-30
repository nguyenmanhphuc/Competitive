import java.util.Arrays;
import java.util.Scanner;

public class C492 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long r = in.nextInt();
		long avg = in.nextLong();
		long need = avg * n;
		ExamC492[] exams = new ExamC492[n];
		long currentTotal = 0;
		for (int i = 0; i < n; ++i) {
			exams[i] = new ExamC492(in.nextInt(), in.nextInt());
			currentTotal += exams[i].currentGrade;
		}
		long left = need - currentTotal;
		left = Math.max(0, left);

		Arrays.sort(exams);
		long totalEssays = 0;
		for (int i = 0; i < n; ++i) {
			long numberEssaysPerPoint = exams[i].numberEssaysPerPoint;
			long maxMore = r - exams[i].currentGrade;
			if (maxMore >= left) {
				totalEssays += left * numberEssaysPerPoint;
				break;
			} else {
				left -= maxMore;
				totalEssays += maxMore * numberEssaysPerPoint;
			}
		}
		
		
		System.out.println(totalEssays);
	}
}

class ExamC492 implements Comparable<ExamC492> {
	public long currentGrade;
	public long numberEssaysPerPoint;

	public ExamC492(long currentGrade, long numberEssaysPerPoint) {
		super();
		this.currentGrade = currentGrade;
		this.numberEssaysPerPoint = numberEssaysPerPoint;
	}

	@Override
	public int compareTo(ExamC492 e) {
		return Long.compare(this.numberEssaysPerPoint, e.numberEssaysPerPoint);
	}
}