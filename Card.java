package week6fp;

public class Card {
	
	private int value;
	private String name;
	
	public Card(String name, int val) {
		this.value = val;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public String setName(String s)	{
		this.name = s;
		return this.name;
	}
	public int getValue() {
		return value;
	}
	public int setValue(int val) {
		this.value = val;
		return this.value;
	}
	public String describe(Card card) {
		return card.getName();
	}
	
	
	
}
