import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A493 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String host = in.next();
		String guest = in.next();
		int n = in.nextInt();

		Map<Integer, Player> map = new HashMap<Integer, Player>();
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < n; ++i) {
			int time = in.nextInt();
			char team = in.next().charAt(0);
			int player = in.nextInt();
			int curPlayer = player;
			char card = in.next().charAt(0);
			Player existPlayer;
			if (team - 'a' == 0) {
				player += 1000;
			}
			existPlayer = map.get(player);
			if (existPlayer == null) {
				map.put(player, new Player(time, card, curPlayer, team));
				if (card == 'r') {
					players.add(new Player(time, card, curPlayer, team));
				}
			} else {
				if (existPlayer.value == 'y') {
					existPlayer.time = time;
					existPlayer.value = 'r';
					map.put(player, existPlayer);
					players.add(new Player(time, card, curPlayer, team));
				}
			}
		}

		Collections.sort(players);

		for (Player player : players) {
			System.out.println(player.toString(host, guest));
		}
	}
}

class Player implements Comparable<Player> {
	int time;
	int value;
	int number;
	char team;

	public Player(int time, int value, int number, char team) {
		this.time = time;
		this.value = value;
		this.team = team;
		this.number = number;
	}

	@Override
	public int compareTo(Player player) {

		return Integer.compare(this.time, player.time);
	}

	@Override
	public String toString() {

		return super.toString();
	}

	public String toString(String host, String guest) {
		return (team == 'a' ? guest : host) + " " + number + " " + time;
	}
}
