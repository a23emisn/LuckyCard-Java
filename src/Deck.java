import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Represents a Deck of cards.
class Deck 
{
	private List<Card> cards = new ArrayList<>(); // A list to contain "a deck of cards".

	// Constructor for Deck.
	public Deck() 
	{
		// A loop that creates a full deck of cards.
		for (int rank = 1; rank < 14; rank++) 
		{
			for (int suitIndex = 0; suitIndex < 4; suitIndex++) 
			{
				cards.add(new Card(rank, suitIndex)); // Card instantiated, and added to list.
			}
		}
	}

	// A method for shuffling the deck, e.g. randomizing order.
	public void shuffleDeck() 
	{
		Collections.shuffle(cards);
	}

	// New method that returns a card from the deck.
	public Card drawCard(int i) 
	{
		return cards.get(i);
	}
}
