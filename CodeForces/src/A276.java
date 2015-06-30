import java.util.Scanner;


public class A276 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		long max =Long.MIN_VALUE;
		for(int i =0; i<n; ++i){
			long f = in.nextLong();
			long t = in.nextLong();
			if(k<t){
				max  =Math.max(max, f-(t-k));
			}else{
				max = Math.max(max, f);
			}
		}
		System.out.println(max);

	}

}
