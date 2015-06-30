import java.util.Arrays;
import java.util.Scanner;

public class A63 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Member[] members = new Member[n];
		for (int i = 0; i < n; ++i) {
			String name = in.next();
			int priorty = 2;
			String type = in.next();
			if (type.equals("rat")) {
				priorty = 1;
			} else if (type.equals("man")) {
				priorty = 3;
			} else if (type.equals("captain")) {
				priorty = 4;
			}
			members[i] = new Member(name, i, priorty);
		}
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].name);
		}
	}
}

class Member implements Comparable<Member> {
	String name;
	int index;
	int priority;

	public Member(String name, int index, int priority) {
		super();
		this.name = name;
		this.index = index;
		this.priority = priority;
	}

	@Override
	public int compareTo(Member m) {
		// TODO Auto-generated method stub
		if (this.priority != m.priority) {
			return this.priority - m.priority;
		}
		return this.index - m.index;
	}
}