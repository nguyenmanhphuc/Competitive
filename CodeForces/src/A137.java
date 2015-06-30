import java.util.Scanner;

public class A137 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int closetVisitTimes = 0;
		char[] objects = in.next().toCharArray();
		char pre = ' ';
		int count = 0;
		for (char c : objects) {
			if (pre == 32) {
				count = 1;
				pre = c;
			} else if (pre == c) {
				count++;
				if (count == 5) {
					closetVisitTimes++;
					count = 0;
					pre = 32;
				}
			} else {
				closetVisitTimes++;
				pre = c;
				count = 1;
			}
		}
		if (count > 0) {
			closetVisitTimes++;
		}
		
		System.out.println(closetVisitTimes);

	}

}
