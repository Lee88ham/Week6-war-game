package week6fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private StringBuilder buildCards = new StringBuilder();
	
	private List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
	private List<String> vals = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	
	public Deck() {
		for (String suit : suits) {
			
			int counter = 2;
			for (String val : vals) {
				buildCards.setLength(0);
				buildCards.append(val + " of " + suit); // card name built as a string
				Card card = new Card(buildCards.toString(), counter); //creates a card object with name and value
				cards.add(card);
				counter += 1;
			}
			
		}
		
		
	}
// creating a deck should generate new cards of the correct value and suit	
// distribute the names - Stringbuilder
	
//-- deck could be a list of card objects--

	

	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		// be able to draw a card - that should remove it from the deck
	}
	
		
	
	


	public void shuffle() {
	Collections.shuffle(this.cards);	
		// be able to shuffle deck
	}
	public int getSize() {
		return cards.size(); 
	}
	
}