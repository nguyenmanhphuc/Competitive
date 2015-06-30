import java.util.Scanner;

public class A443 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.nextLine().toCharArray();
		boolean[] exists = new boolean[300];
		int count =0;
		for (int i = 0; i < s.length; ++i) {
			if (s[i] <= 'z' && s[i] >= 'a') {
				if(!exists[s[i]]){
					count++;
				}
				exists[s[i]]=true;
			}	
		}
		System.out.println(count);

	}
}
