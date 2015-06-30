import java.util.Hashtable;
import java.util.Scanner;

public class LanguageDetection12250 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int cas = 1;
		StringBuilder str = new StringBuilder();
		Hashtable<String, String> has = new Hashtable<String, String>();
		has.put("HELLO", "ENGLISH");
		has.put("HOLA", "SPANISH");
		has.put("HALLO", "GERMAN");
		has.put("BONJOUR", "FRENCH");
		has.put("CIAO", "ITALIAN");
		has.put("ZDRAVSTVUJTE", "RUSSIAN");
		while (!(s = in.next()).equals("#")) {
			str.append("Case ");
			str.append(cas++);
			str.append(": ");
			String result = has.get(s);
			if(result==null){
				str.append("UNKNOWN");
			}else{
				str.append(result);
			}
			str.append('\n');
		}
		System.out.print(str);

	}
}
