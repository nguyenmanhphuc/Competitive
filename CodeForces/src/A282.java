import java.util.Scanner;

public class A282 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int cur = 0;
		for(int i =0; i<n; ++i){
			char[] s = in.next().toCharArray();
			if(s[1]=='+'){
				cur++;
			}else{
				cur--;
			}
		}
		System.out.println(cur);

	}

}
