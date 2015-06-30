import java.util.Scanner;

public class A427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int curPolice = 0;
		for (int i = 0; i < n; ++i) {
			int event = in.nextInt();
			if (event == -1) {
				if(curPolice==0){
					count++;
				}else{
					curPolice--;
				}
			} else {
				curPolice += event;
			}
		}
		System.out.println(count);

	}
}
