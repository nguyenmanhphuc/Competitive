import java.util.Scanner;

public class WhatTheFrequencyKenneth499 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int max = 0;
			StringBuilder result = new StringBuilder();
			String s = in.nextLine();
			int l = s.length();
			int[] frequencies = new int[300];
			for (int i = 0; i < l; ++i) {
				frequencies[s.charAt(i)]++;
			}

			for (char i = 'A'; i <= 'Z'; ++i) {
				if (frequencies[i] > max) {
					result = new StringBuilder();
					max = frequencies[i];
					result.append(i);
				} else if (frequencies[i] == max) {
					result.append(i);
				}
			}

			for (char i = 'a'; i <= 'z'; ++i) {
				if (frequencies[i] > max) {
					result = new StringBuilder();
					max = frequencies[i];
					result.append(i);
				} else if (frequencies[i] == max) {
					result.append(i);
				}
			}
			result.append(' ');
			result.append(max);
			System.out.println(result);
		}
	}
}
