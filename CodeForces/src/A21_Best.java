import java.util.Scanner;

public class A21_Best {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		String pattern = "^[a-zA-Z0-9_]{1,16}@[a-zA-Z0-9_]{1,16}(.[a-zA-Z0-9_]{1,16})*";
		String pattern2 = "^[a-zA-Z0-9_]{1,16}@[a-zA-Z0-9_.]{1,32}$";

		String pattern3 = "^[a-zA-Z0-9_]{1,16}@[a-zA-Z0-9_]{1,16}(.[a-zA-Z0-9_]{1,16})*/[a-zA-Z0-9_]{1,16}$";
		String pattern4 = "^[a-zA-Z0-9_]{1,16}@[a-zA-Z0-9_.]{1,32}/[a-zA-Z0-9_]{1,16}$";
		
		if(s.matches(pattern)&&s.matches(pattern2)){
			System.out.println("YES");
			
		}else if (s.matches(pattern3)&&s.matches(pattern4)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
