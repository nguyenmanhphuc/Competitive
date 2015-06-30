import java.util.Scanner;

public class C509 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int num[][] = new int[n][700];
		int temp = in.nextInt();
		int pre = temp;
		int j = 0;
		while (temp > 0) {
			if (temp > 9) {
				num[0][j++] = 9;
				temp -= 9;
			} else {
				num[0][j] = temp;
				break;
			}
		}
		int index = j;
		StringBuilder str = new StringBuilder();
		for (; j >= 0; --j) {
			str.append(num[0][j]);
		}
		str.append('\n');

		for (int i = 1; i < n; ++i) {
			temp = in.nextInt();
			if (temp == pre) {
				pre = temp;
				int pos = -1;
				for (j = 0; j <= index; ++j) {
					if (num[i - 1][j] > 0) {
						for (int k = j + 1; k <= index; ++k) {
							if (num[i - 1][k] < 9) {
								pos = k;
								break;
							}
						}
						break;
					}
				}
				if (pos > 0) {
					num[i][pos] = num[i - 1][pos] + 1;
					temp -= num[i][pos];
					for (int k = pos + 1; k <= index; ++k) {
						num[i][k] = num[i - 1][k];
						temp -= num[i][k];
					}
					int k = 0;
					while (temp > 0) {
						if (temp > 9) {
							num[i][k++] = 9;
							temp -= 9;
						} else {
							num[i][k] = temp;
							break;
						}
					}

				} else {
					index++;
					pre = temp;
					temp--;
					num[i][index] = 1;
					for (int k = 0; k < index; ++k) {
						if (temp > 9) {
							num[i][k] = 9;
							temp -= 9;
						} else {
							num[i][k] = temp;
							temp = 0;
						}
					}
				}
				for (int k = index; k >= 0; k--) {
					str.append(num[i][k]);
				}
				str.append('\n');
			} else if (temp > pre) {
				int max = (index + 1) * 9;
				if (temp <= max) {
					int left = temp - pre;
					for (int k = 0; k <= index; ++k) {
						num[i][k] = left + num[i - 1][k] > 9 ? 9 : left
								+ num[i - 1][k];
						left -= left + num[i - 1][k] > 9 ? 9 - num[i - 1][k]
								: left;
					}
					pre = temp;
				} else {
					pre = temp;
					index = (temp + 8) / 9;
					index--;
					
					int k = 0;
					while (temp > 0) {
						if (temp > 9) {
							num[i][k++] = 9;
							temp -= 9;
						} else {
							num[i][k] = temp;
							break;
						}
					}
					
				}
				for (int k = index; k >= 0; k--) {
					str.append(num[i][k]);
				}
				str.append('\n');
			} else {
				int sum = 0;
				int k;
				for (k = index; k >= 0; --k) {
					num[i][k] = num[i - 1][k];

					sum += num[i][k];
					if (sum >= temp) {
						break;
					}
				}

				sum -= num[i - 1][k];
				int pos = -1;
				for (k = k + 1; k <= index; ++k) {
					if (num[i][k] < 9) {
						pos = k;
						num[i][k]++;
						break;
					}else{
						sum-=num[i][k];
					}
				}
				if (pos == -1) {
					index++;
					num[i][index] = 1;
					int z = temp - 1;
					for (k = 0; k < index; ++k) {
						num[i][k] = Math.min(9, z);
						z = z < 9 ? 0 : z - 9;
					}
				} else {
					int z = sum + 1;
					z = temp - z;
					for (k = 0; k < pos; ++k) {
						num[i][k] = Math.min(9, z);
						z = z < 9 ? 0 : z - 9;
					}
				}
				pre = temp;

				for (k = index; k >= 0; k--) {
					str.append(num[i][k]);
				}
				str.append('\n');
			}

		}
		System.out.print(str);

	}

}
