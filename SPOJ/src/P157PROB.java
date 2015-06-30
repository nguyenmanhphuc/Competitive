import java.util.HashMap;
import java.util.Scanner;

public class P157PROB {

	public static void main(String[] args) {
		HashMap<String, B> map = new HashMap<>();
		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 7; ++i) {
			double b = Math.pow(2, i);
			for (int j = 1; j < b; ++j) {
				double number = j / b;
				double t = 1;
				for (int k = 1; k <= 6; ++k) {
					t *= 10;
					double r = Math.ceil(number * t) / t;
					String rs = String.format("%." + k + "f", r);
					if (map.get(rs) == null) {

						map.put(rs, new B(j, (int) b));
					}
					 System.out.println(number + " " + rs);
					
					r = Math.floor(number * t) / t;
					rs = String.format("%." + k + "f", r);
					;
					if (map.get(rs) == null) {
						map.put(rs, new B(j, (int) b));
					}
					 System.out.println(number + " " + rs);
					r = (int) Math.round((number * t)) / t;
					rs = String.format("%." + k + "f", r);
					;
					if (map.get(rs) == null) {
						map.put(rs, new B(j, (int) b));
					}
					 System.out.println(number + " " + rs);

				}
			}
		}

		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			String input = in.next();
			// input += 0.00000000001;
			int index = input.indexOf(".");
			if (index < 0) {
				System.out.println(input + "\"");
				continue;
			}
			String c = input.substring(0, index);
			if (c.equals("")) {
				c = "0";
			}

			if (index == input.length() - 1) {
				System.out.println(c + "\"");
				continue;
			}

			input = "0" + input.substring(index);

			B b = map.get(input);
			
			if (c.equals("0")) {
				System.out.println(b.a + "/" + b.b + "\"");
			} else {
				System.out.println(c + " " + b.a + "/" + b.b + "\"");
			}
		}
	}
}

class B {
	int a;
	int b;

	public B(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}