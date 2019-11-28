package game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SnakeLadder {
	List<PlayerOne> player1;
	List<PlayerTwo> player2;
	int max = 10;
	Scanner sc;
	public static void main(String[] args) {
		new SnakeLadder().run();
	}
	private void run() {
		player1 = new ArrayList<>();
		player2 = new ArrayList<>();

		System.out.println("Start GAME");
		do {
			int dicevaule = (int) (6.0 * Math.random());
			System.out.println("Enter Player Name (S or K)");
			sc = new Scanner(System.in);
			String name = "";
			try {
				name = sc.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("Please Enter Only PLAYER NAME");
			}
			if (name.equalsIgnoreCase("S")) {
				player1.add(new PlayerOne(dicevaule));
			} else if (name.equalsIgnoreCase("K")) {
				player2.add(new PlayerTwo(dicevaule));
			}
		} while (!score());
		sc.close();
		int p1finalScore = 0;
		int p2finalScore = 0;
		try {
			for (int i = 0; i < player1.size(); i++) {
				p1finalScore += player1.get(i).getPlayerScore();
				p2finalScore += player2.get(i).getPlayerScore();

			}
		} catch (IndexOutOfBoundsException e) {
		}
		if (p1finalScore < p2finalScore) {
			System.out.println("Player2 Wins!");
		} else {
			System.out.println("Player1 Wins!");
		}

	}

	boolean score() {
		int sc = 0;
		int sc1 = 0;
		for (PlayerOne playerOne : player1) {
			Integer playerScore = playerOne.getPlayerScore();
			sc += playerScore;
		}
		System.out.println("Player1 current score: " + sc);
		if (sc >= this.max) {
			return true;
		}
		for (PlayerTwo playerOne : player2) {
			Integer playerScore = playerOne.getPlayerScore();
			sc1 += playerScore;
		}
		System.out.println("Player2 current score: " + sc1);
		if (sc1 >= this.max) {
			return true;
		}
		return false;
	}

}
class PlayerOne {

	Integer playerScore;
	public PlayerOne(Integer playerScore) {
		this.playerScore = playerScore;
	}
	public Integer getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(Integer playerScore) {
		this.playerScore = playerScore;
	}
}
class PlayerTwo {

	Integer playerScore;
	public PlayerTwo(Integer playerScore) {
		this.playerScore = playerScore;
	}
	public Integer getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(Integer playerScore) {
		this.playerScore = playerScore;
	}
}