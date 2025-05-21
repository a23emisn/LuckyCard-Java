// Represents a playing card.
class Card 
{
	private int rank; // Represents the number on the card.
	private int value; // Represents the value of the card, (rank + bonus).
	private String suit; // Represents the suit of the card.
	private String[] suits = { "Diamond", "Club", "Heart", "Spade" }; // All of the available suits.

	// Constructor for Card.
	public Card(int rank, int suitIndex) 
	{
		this.rank = rank;
		this.suit = suits[suitIndex];
		this.value = rank + getBonus(suit);
	}

	// Return the rank of the card.
	public int getRank() 
	{
		return rank;
	}

	// Return the value of the card.
	public int getValue() 
	{
		return value;
	}

	// Return the suit of the card.
	public String getSuit() 
	{
		return suit;
	}

	// Calculating bonus from the suit of the card.
	private int getBonus(String suit) 
	{
		int bonus = 0;
		switch (suit) 
		{
		case "Diamond":
			bonus = 4;
			break;
		case "Club":
			bonus = 6;
			break;
		case "Heart":
			bonus = 8;
			break;
		case "Spade":
			bonus = 10;
			break;
		}
		return bonus;
	}
}