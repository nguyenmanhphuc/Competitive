import java.util.Scanner;

public class A519 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int weights[] = new int[255];
		weights['q'] = 9;
		weights['Q'] = 9;
		weights['r'] = 5;
		weights['R'] = 5;
		weights['b'] = 3;
		weights['B'] = 3;
		weights['n'] = 3;
		weights['N'] = 3;
		weights['p'] = 1;
		weights['P'] = 1;

		long sumW = 0;

		long sumB = 0;

		for (int i = 0; i < 8; ++i) {
			char[] s = in.next().toCharArray();
			for (int j = 0; j < 8; ++j) {
				if (s[j] >= 'a') {
					sumB += weights[s[j]];
				}else{
					sumW += weights[s[j]];
				}
			}
		}
		
		if(sumB==sumW){
			System.out.println("Draw");
		}else if(sumB>sumW){
			System.out.println("Black");
		}else{
			System.out.println("White");
		}
	}
}
