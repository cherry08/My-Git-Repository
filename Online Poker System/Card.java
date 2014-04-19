package online.poker.system.ck;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Card{

	//Each card has a suit value assigned to it
	private CardSuit cardsuit;

	//Each card has some weight assigned to it
	private CardWeight weight;

	//A card is a unique combination of suit and weight pair
	public Card(CardSuit cardsuit, CardWeight weight){
		this.cardsuit = cardsuit;
		this.weight = weight;
	}

	/* EXTRA FUNCTIONALITY FOR TESTING */
	//Return card's suit and weight in string format
	public String showSuitWeight(){
		return cardsuit + " " + weight;
	}

	//Return weight value of the card
	public CardWeight returnweight(){
		return weight;
	}

	//Return suit of the card
	public CardSuit returnsuit(){
		return cardsuit;
	}
}