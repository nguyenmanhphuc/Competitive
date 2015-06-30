import java.util.Arrays;
import java.util.Scanner;

public class A158 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		int left = n-k;
		int score = arr[left];
		for(int i =0; i<n; ++i){
			if(arr[i]>=score&&arr[i]>0){
				System.out.println(n-i);
				return;
			}
		}
		System.out.println(0);

	}

}
