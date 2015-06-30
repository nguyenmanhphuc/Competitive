import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class C327 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char a[] = in.next().toCharArray();
		int k = in.nextInt();
		long result = 0;
		int b = 0;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] == '0' || a[i] == '5') {
				result = (pow(2, i) + result) % 1000000007;
			}
		}
		long step = pow(2, a.length);
		long z = (pow(step, k) - 1);
		if (z < 0) {
			z += 1000000007;
		}
		long p = step == 0 ? 1000000006 : step - 1;

		long r = modInverse(p,1000000007);
		System.out.println(((result * r)%1000000007 * z) % 1000000007);

	}

	static long pow(long k, int n) {
		long temp = 1;
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 1) {
			temp = k;
		}

		long t = pow(k, n / 2);
		temp = temp * ((t * t)% 1000000007);
		return temp % 1000000007;
	}

	
	static long pow(long a, long b, long MOD) {
		long x = 1, y = a;
		    while(b > 0) {
		        if(b%2 == 1) {
		            x=(x*y);
		            if(x>MOD) x%=MOD;
		        }
		        y = (y*y);
		        if(y>MOD) y%=MOD;
		        b /= 2;
		    }
		    return x;
		}
		 
	static long modInverse(long a, long m) {
		    return pow(a,m-2,m);
		}
}
