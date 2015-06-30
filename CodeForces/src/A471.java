import java.util.Scanner;

public class A471 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counts[] = new int[10];
		int distinct = 0;
		boolean hasFour = false;
		int t = 0;
		for (int i = 0; i < 6; ++i) {
			int temp = in.nextInt();
			counts[temp]++;
			hasFour = counts[temp] >= 4 ||hasFour;
			if (hasFour) {
				t = temp;
			}
		}

		if (!hasFour) {
			System.out.println("Alien");
			return;
		}
		if(counts[t]==6){
			System.out.println("Elephant");
			return;
		}
		
		for(int i =1; i<=9; ++i){
			if(counts[i]==2){
				System.out.println("Elephant");
				return;
			}
		}
		
		System.out.println("Bear");

	}

}
