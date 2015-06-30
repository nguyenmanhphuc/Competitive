import java.util.Scanner;


public class A155 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max =in.nextInt();
		int min = max;
		int countAmazingResult =0;
		for(int i=1; i<n; ++i){
			int temp  = in.nextInt();
			if(temp>max){
				max=temp;
				countAmazingResult++;
			} if(temp<min){
				min = temp;
				countAmazingResult++;
			}
		}
		System.out.println(countAmazingResult);
	}

}
