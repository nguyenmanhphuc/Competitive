import java.util.Arrays;
import java.util.Scanner;

public class B155 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Card[] cards = new Card[n];
		for (int i = 0; i < n; ++i) {
			cards[i] = new Card(in.nextInt(), in.nextInt());
		}
		int result = 0;
		int counter = 1;
		Arrays.sort(cards);
		for (int i = 0; i < n; ++i) {
			result += cards[i].top;
			counter += cards[i].bottom - 1;
			if (counter == 0) {
				break;
			}
		}
		System.out.println(result);
	}

	static class Card implements Comparable<Card> {
		public int top;
		public int bottom;

		public Card(int top, int bottom) {
			super();
			this.top = top;
			this.bottom = bottom;
		}

		@Override
		public int compareTo(Card c) {
			if (this.bottom != c.bottom) {
				return c.bottom - this.bottom;
			}
			return c.top - this.top;
		}
	}

}
