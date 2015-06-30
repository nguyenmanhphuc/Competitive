import java.util.Scanner;

public class A469 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] levels = new int[n + 1];
		int p = in.nextInt();
		for (int i = 0; i < p; ++i) {
			levels[in.nextInt()] = 1;
		}
		
		int q = in.nextInt();
		for (int i = 0; i < q; ++i) {
			levels[in.nextInt()] = 1;
		}
		
		for(int i =1; i<=n; ++i){
			if(levels[i]==0){
				System.out.println("Oh, my keyboard!");
				return;
			}
		}
		System.out.println("I become the guy.");

	}

}
