import java.util.Scanner;

public class B478 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();

		long minMember = n / m;
		long mod = n % m;
		long min = (m - mod) * ((minMember) * (minMember - 1) >> 1) + mod
				* ((minMember + 1) * (minMember) >> 1);
		long maxMembers = n - m + 1;
		long max = maxMembers * (maxMembers - 1) >> 1;
		System.out.println(min + " " + max);

	}
}
