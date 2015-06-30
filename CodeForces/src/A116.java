import java.util.Scanner;

public class A116 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = 0;
		int current = 0;
		for(int i =0; i<n; ++i){
			current-=in.nextInt();
			current+=in.nextInt();
			max = Math.max(current, max);
		}
		System.out.println(max);

	}

}
