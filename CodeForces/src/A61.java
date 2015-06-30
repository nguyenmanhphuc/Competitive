import java.util.Scanner;

public class A61 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		char[] t = in.next().toCharArray();
		StringBuilder str = new StringBuilder();
		int length = s.length;
		boolean hasOne = false;
		for(int i =0; i<length; ++i){
			if(s[i]!=t[i]){
				str.append('1');
				hasOne= true;
			}else{
				str.append('0');
			}
		}
		System.out.println(str);

	}

}
