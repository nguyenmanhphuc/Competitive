import java.util.Scanner;


public class A334 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int half = n/2;
		int max = n*n;
		int min = 1;
		StringBuilder str= new StringBuilder();
		for(int i =1; i<=n; ++i){
			for(int j =1; j<=half; ++j){
				if(j>1){
					str.append(' ');
				}
				str.append(min++);
				str.append(' ');
				str.append(max--);
			}
			str.append('\n');
		}
		System.out.print(str);

	}

}
