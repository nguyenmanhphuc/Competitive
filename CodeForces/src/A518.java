import java.util.Scanner;

public class A518 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char s[] = in.next().toCharArray();String tS  = in.next();
		char t[] = tS.toCharArray();
		int l = s.length;
		StringBuilder str = new StringBuilder();
		int more = 1;
		for (int i = l - 1; i > 0; --i) {
			if (s[i] + more > 'z') {
				str.append('a');
				more = 1;
			} else {
				
				str.append((char) (s[i] + more));more = 0;
			}
			
		}
		if (more == 1 && s[0] == 'z') {
			str.append("aa");
		}else{
			str.append((char)(s[0]+more));
		}
		String z = str.reverse().toString();
		if(z.equals(tS)){
			System.out.println("No such string");
		}else{
			System.out.println(z);
		}

	}

}
