import java.util.Scanner;


public class A515 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Math.abs(in.nextInt());
		int b= Math.abs(in.nextInt());
		int s = in.nextInt();
		if(s<a+b){
			System.out.println("No");
		}else if((a+b-s)%2!=0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}

}
