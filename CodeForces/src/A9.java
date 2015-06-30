import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int max = Math.max(x, y);
		int left = 6 - max+1;
		if(left==0){
			System.out.println("0/1");
		}else if(left==1){
			System.out.println("1/6");
		}
		else if(left==2){
			System.out.println("1/3");
		}
		else if(left==3){
			System.out.println("1/2");
		}
		else if(left==4){
			System.out.println("2/3");
		}
		else if(left==5){
			System.out.println("5/6");
		}else if(left==6){
			System.out.println("1/1");
		}

	}

}
