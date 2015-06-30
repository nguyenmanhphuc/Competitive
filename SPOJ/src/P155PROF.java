import java.util.Scanner;

public class P155PROF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		long n = in.nextLong();
		long arr[] = new long[6];
		arr[1] = x;
		arr[2] = y;
		arr[3] = y - x;
		arr[4] = -x;
		arr[5] = -y;
		arr[0] = -y + x;
		long result;
		if(n%6==0){
			 result = arr[0];
			
		}else{
			result =arr[(int) (n%6)];
		}
		if(result<0){
			result+=1000000007;
		}
		result%=1000000007 ;
		System.out.println(result);
	}

	public static long getNthfibo(long n) {

		if (n <= 1)
			return 0;

		long[][] result = { { 1, 0 }, { 0, 1 } }; // identity matrix.
		long[][] fiboM = { { 1, 1 }, { 1, 0 } };

		while (n > 0) {
			if (n % 2 == 1) {
				multMatrix(result, fiboM);
			}
			n = n / 2;
			multMatrix(fiboM, fiboM);
		}

		return result[1][0];
	}

	private static void multMatrix(long[][] m, long[][] n) {
		long a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
		long b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
		long c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
		long d = m[1][0] * n[0][1] + m[1][1] * n[1][1];

		m[0][0] = a % 1000000007;
		m[0][1] = b % 1000000007;
		m[1][0] = c % 1000000007;
		m[1][1] = d % 1000000007;
	}
}
