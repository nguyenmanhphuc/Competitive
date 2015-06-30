import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] hor = new boolean[8];
		boolean[] ver = new boolean[8];

		char[][] arr = new char[8][8];
		int countHor = 0;
		int countVer = 0;
		for (int i = 0; i < 8; ++i) {
			arr[i] = in.next().toCharArray();
			for (int j = 0; j < 8; ++j) {
				if (arr[i][j] == 'W') {
					if (!hor[i]) {
						countHor++;
						hor[i]=true;
					}

					if (!ver[j]) {
						ver[j]=true;
						countVer++;
					}
				}
			}
		}

		int result = 0;
		if (countHor == 0) {
			result = 8;
		}else{
			result = 16-countHor-countVer;
		}
		System.out.println(result);
	}

}
