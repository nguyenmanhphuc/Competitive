import java.util.Scanner;


 class Main {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-->0){
			int a = in.nextInt();
			int b = in.nextInt();
			if(a>b){
				System.out.println(">");
			}else if(a==b){
				System.out.println("=");
			}else{
				System.out.println("<");
			}
		}
	}

}
