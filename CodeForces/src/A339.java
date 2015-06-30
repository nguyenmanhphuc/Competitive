import java.util.Scanner;

public class A339 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;
		char []count = new char[300];
		for(int i =0; i<length; ++i){
			count[s[i]]++;
		}
		
		StringBuilder str = new StringBuilder();
		boolean has = false;
		for(int i = '1'; i<='3'; ++i){
			for(int j =0; j<count[i]; ++j){
				if(has){
					str.append('+');
				}else{
					has=true;
				}
				str.appendCodePoint(i);
			}
		}
		System.out.println(str);
	}

}
