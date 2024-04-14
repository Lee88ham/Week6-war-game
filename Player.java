package week6fp;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	
	private int score = 0;
	private String name;
	public Player(String name) {
		this.setName(name);
	}
	public void describe(Player player) {
		System.out.println(player.getName() + "has the following cards");
		for (Card c: hand) {
			System.out.println(c.describe(c));
		}
	}
	public Card flipCard() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void score() {
		this.score ++;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}



//Fields

//1.     hand (List of Card)
//
// 2.     score (set to 0 in the constructor)
//
// 3.     name