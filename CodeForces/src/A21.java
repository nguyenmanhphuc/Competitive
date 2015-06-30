import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();

		int length = arr.length;

		int count = 0;
		int sum = 0;
		int resource = 0;
		int i = 0;
		while (i < length&&arr[i] != '@' ) {
			if (!check(arr[i])) {
				System.out.println("NO");
				return;
			} else {
				count++;
			}
			i++;
		}

		if (i == length || count > 16||count==0) {
			System.out.println("NO");
			return;
		}
		i++;

		count = 0;
		while (i < length &&arr[i] != '/' ) {
			sum++;
			if (arr[i] == '.') {
				if (count == 0 || count > 16) {
					System.out.println("NO");
					return;
				}
				count = 0;
			} else if (!check(arr[i])) {
				System.out.println("NO");
				return;
			} else {
				count++;
			}
			i++;
		}

		if (i == length) {
			if (count == 0 || count > 16 || sum > 32) {
				System.out.println("NO");
				return;
			}

			System.out.println("YES");
			return;
		}else{
			if (count == 0 || count > 16 || sum > 32) {
				System.out.println("NO");
				return;
			}
		}

		count = 0;
		
		for(i=i+1; i<length; ++i){
			if(!check(arr[i])){
				System.out.println("NO");
				return;
			}
			count++;
		}
		if(count==0||count>16){
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}

	static boolean check(char c) {
		if (c <= 'Z' && c >= 'A') {
			return true;
		}

		if (c <= 'z' && c >= 'a') {
			return true;
		}

		if (c >= '0' && c <= '9') {
			return true;
		}

		if (c == '_') {
			return true;
		}

		return false;
	}

}
