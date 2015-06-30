import java.text.DecimalFormat;
import java.util.Scanner;

public class B20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		double money = 15.9;
        double mula = 36.56789;
        DecimalFormat decFor = new DecimalFormat("0.000000");

 	
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println(-1);
					
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(1);
				System.out.println(decFor.format(-c/b));
			}

		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println(0);
			} else if (delta == 0) {
				System.out.println(1);
				System.out.println(decFor.format(-b / 2 / a));
			} else {
				System.out.println(2);
				double sq = Math.sqrt(delta);
				double x1 = (-b + sq) / 2 / a;
				double x2 = (-b - sq) / 2 / a;
				if(x1<x2){
					
					System.out.println(decFor.format(x1));
					System.out.println(decFor.format(x2));
				}else{
					System.out.println(decFor.format(x2));
					System.out.println(decFor.format(x1));;
				}
			}

		}

	}
}
