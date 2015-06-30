import java.util.Scanner;
import java.util.Stack;

public class C158 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String curDir = "";
		for (int i = 0; i < n; ++i) {
			String command = in.next();
			if (command.equals("pwd")) {
				System.out.println(curDir + "/");
				continue;
			}

			String path = in.next();
			if (path.charAt(0) == '/') {
				curDir = path;
			} else {
				curDir += "/" + path;
			}
			String[] dir = curDir.split("/");
			int index = 1;
			for (int j = 1; j < dir.length; ++j) {
				if (dir[j].equals("..")) {
					index--;
				} else {
					dir[index++] = dir[j];
				}
			}
			StringBuilder str = new StringBuilder();
			for (int j = 1; j < index; ++j) {
				str.append('/');
				str.append(dir[j]);
			}
			curDir = str.toString();
		}
	
	}

}
