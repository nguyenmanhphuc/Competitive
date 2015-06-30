import java.util.Scanner;


public class A520 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n = in.nextInt();
		String s = in.next().toLowerCase();
		int [] count = new int[26];
		for(int i=0; i<n; ++i){
			count[s.charAt(i)-'a']++;
		}
		
		for(int i =0; i<26; ++i){
			if(count[i]==0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

}
