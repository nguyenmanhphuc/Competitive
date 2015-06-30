import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		solveB();

	}

	static void solveB() throws IOException {
		initReader();
		boolean isNotPrime[] = new boolean[1001];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int i = 3; i <= 1000; i += 2) {
			if (!isNotPrime[i]) {
				for (int j = i + i; j <= 1000; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
		// Scanner in = new Scanner(System.in);
		Integer n;
		while ((n = nextInt())!=null) {
			
			if (n < 2 || (n > 2 && n % 2 == 0)) {
				System.out.println("no");
			} else {
				System.out.println(isNotPrime[n] ? "no" : "yes");
			}

		}

	}

	static void solveC() throws IOException {
		initReader();
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		while (a + b + c > 0) {
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			max = Math.max(max, c);
			min = Math.min(min, c);
			int l = a + b + c - max - min;
			if (l * l + min * min == max * max) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			a = nextInt();
			b = nextInt();
			c = nextInt();
		}
	}
	

	private static BigInteger fastFibonacciMatrix(int n) {
		BigInteger[] matrix = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
		return pow(matrix, n)[1];
	}
	
	// Computes the power of a matrix
	private static BigInteger[] pow(BigInteger[] matrix, int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
		while (n != 0) {  
			if (n % 2 != 0)
				result = multiply(result, matrix);
			n /= 2;
			matrix = multiply(matrix, matrix);
		}
		return result;
	}
	
	private static BigInteger[] multiply(BigInteger[] x, BigInteger[] y) {
		return new BigInteger[] {
			multiply(x[0], y[0]).add(multiply(x[1], y[2])),
			multiply(x[0], y[1]).add(multiply(x[1], y[3])),
			multiply(x[2], y[0]).add(multiply(x[3], y[2])),
			multiply(x[2], y[1]).add(multiply(x[3], y[3]))
		};
	}
	private static BigInteger multiply(BigInteger x, BigInteger y) {
		return x.multiply(y);  // Replace this line with Karatsuba multiplication, etc. if available
	}



	static BufferedReader reader;
	static StringTokenizer tokenizer;

	public static void initReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			String n = reader.readLine();
			if (n == null) {
				return null;
			}
			tokenizer = new StringTokenizer(n);

		}
		return tokenizer.nextToken();
	}

	static String nextLine() throws IOException {
		return reader.readLine();
	}

	static Integer nextInt() throws IOException {
		String next = next();
		if(next==null){
			return null;
		}
		return Integer.parseInt(next);
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static Double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

}
