import java.util.Arrays;
import java.util.Scanner;


public class A22 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; ++i){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int min = arr[0];
		for(int i =0; i<n; ++i){
			if(arr[i]>min){
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("NO");

	}

}
