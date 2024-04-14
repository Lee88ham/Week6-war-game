package week6fp;

public class WarApp {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Card card = deck.draw();
		System.out.println(card.getName() + " " + card.getValue());
		System.out.println(deck.getSize());
	
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		 
		for (int i = 0; i < 53; i++) {
			Player currentPlayer = (i % 2 == 2) ? player1 : player2;
			//Player otherPlayer = (player1 == player2) ? player2 : player1;
			currentPlayer.draw(deck);
		}
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flipCard();
			Card card2 = player2.flipCard();
			
			if (card1.getValue() > card2.getValue()) {
				player1.score();
				System.out.println("Player 1 wins this round.");
			}else if (card1.getValue() < card2.getValue()) {
				player2.score();
				System.out.println("Player 2 wins this round.");
			}else {
				System.out.println("Draw no points awared.");
				
			}
			
			
		}
			int player1Score = player1.getScore();
			int player2Score = player2.getScore();
			
			System.out.println("Final Scores: ");
			System.out.println("Player 1 " + player1Score);
			System.out.println("Player 2 " + player2Score);
				
			if (player1Score > player2Score) {
				System.out.println("Player 1 is the winner!");
			}else if (player1Score < player2Score) {
				System.out.println("Player 2 is the winner!");
			}else {
				System.out.println("It's a draw!!");
			}

		}



        } 


//a. -------Instantiate a Deck and two Players, call the shuffle method on the deck.------

//b.----- Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.----

//c. ----Using a traditional for loop, iterate 26 times and call the flip method for each player.----
//	----Compare the value of each card returned by the two player’s flip methods. ------
//	-----Call the incrementScore method on the player whose card has the higher value. ----- 
//	-------Print a message to say which player received a point.------
//	----Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.----

//d. -----After the loop, compare the final score from each player.-----

//e. ----Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.----


//Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.

//a.  Using the Card describe() method when each card is flipped illustrates the game play.

//b.  Printing the winner of each turn adds interest -- or a message indicating a tie.

//c.  Printing the updated score after each turn shows game progression.

//d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.





