import java.util.Scanner;

// Class that manages game logic.
class Game 
{
	Scanner inputScanner = new Scanner(System.in); // Initialize a Scanner object for user input.
	Deck deck = new Deck(); // Instantiate a new Deck object.

	// This method executes the game.
	public void play() 
	{
		Scanner inputScanner = new Scanner(System.in); // Initialize a Scanner object for user input.
		System.out.println("Welcome to Lucky Card game by Emil Snäckerström!\n");
		String playAgain; // String to contain user input.

		// Loop representing a game round.
		do 
		{
			deck.shuffleDeck(); // Call method to shuffle the deck.

			System.out.println("------- Playing a game round");

			int cardValue[] = new int[3]; // Array to store total value of cards, to check for win.

			// Loop through the first three cards in the list, and display attributes of a
			// card.
			for (int i = 0; i < 3; i++) 
			{
				Card card = deck.drawCard(i);
				System.out.println("Card " + (i + 1) + ": " + card.getSuit() + "s " + card.getRank() + " -> Value = "
						+ card.getValue());
				cardValue[i] = card.getValue(); // Adding card's total value to array at.
			}
			// Check if the third card's total value is between the first two cards total
			// values.
			if (cardValue[2] > cardValue[0] && cardValue[2] < cardValue[1]
					|| cardValue[2] < cardValue[0] && cardValue[2] > cardValue[1]) 
			{
				System.out.println("\nYou win!"); // Display win message.
			} 
			else 
			{
				System.out.println("\nYou lose!"); // Display lose message.
			}
			System.out.println("\n=========> Press ENTER to play again or \"q\" to quit: "); // Prompt to play again.
			playAgain = inputScanner.nextLine(); // User input is stored in 'playAgian'.

		} while (!(playAgain.equals("q"))); // Exits the loop if 'q' was entered, continues otherwise.

		System.out.println("\nThank you for playing and welcome back!");
		inputScanner.close(); // Close the Scanner object.
	}
}