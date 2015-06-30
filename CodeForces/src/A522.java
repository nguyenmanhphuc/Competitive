import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A522 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put("Polycarp".toLowerCase(), 1);
		int max =1;
		for(int i =0; i<n; ++i){
			String name1 =in.next();
			String repost  = in.next();
			String name2 = in.next();
			name1 = name1.toLowerCase();
			int v = map.get(name2.toLowerCase()).intValue();
			v++;
			map.put(name1, v);
			max = Math.max(max, v);
		}
		System.out.println(max);
	}

}
