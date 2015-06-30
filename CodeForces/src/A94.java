import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A94 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String info = in.next();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 10; ++i) {
			map.put(in.next(), i);
		}
		for (int i = 0; i < 8; ++i) {
			System.out.print(map.get(info.substring(i * 10, i * 10 + 10)));
		}
		System.out.println();

	}
}
