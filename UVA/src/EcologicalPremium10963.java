import java.util.Scanner;

public class EcologicalPremium10963  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberTestCase = in.nextInt();
		for (int i = 0; i < numberTestCase; ++i) {
			int numberFarmers = in.nextInt();
			long buget = 0;
			for (int j = 0; j < numberFarmers; ++j) {
				long area = in.nextLong();
				long animals = in.nextLong();
				long e = in.nextLong();
				buget += area * e;
			}
			System.out.println(buget);
		}
		in.close();
	}
}
