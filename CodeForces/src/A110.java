import java.util.Scanner;

public class A110 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;
		int count = 0;
		for (int i = 0; i < length; ++i) {
			if (s[i] == '7' || s[i] == '4') {
				count++;
			}
		}
		if(count==7||count==4){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
