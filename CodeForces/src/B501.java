import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B501 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> oldNames = new ArrayList<>();

		Map<String, String> change = new HashMap<>();
		Map<String, String> belong = new HashMap<>();

		for (int i = 0; i < n; ++i) {
			String s = in.next();
			String t = in.next();
			if (belong.get(s) == null) {
				oldNames.add(s);
				change.put(s, t);
				belong.put(t, s);
			} else {
				String m = belong.get(s);
				belong.put(t, m);
				change.put(m, t);
			}
		}
		
		int size = oldNames.size();
		System.out.println(size);
		for(int i =0; i<size; ++i){
			System.out.println(oldNames.get(i) + " "
					+ change.get(oldNames.get(i)));
		}

	}

}
