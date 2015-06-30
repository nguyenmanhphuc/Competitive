import java.util.Scanner;


public class A4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>=4&&n%2==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
