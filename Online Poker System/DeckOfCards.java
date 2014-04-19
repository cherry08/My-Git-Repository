package online.poker.system.ck;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;


//DeckOfCards 
public class DeckOfCards
{
	//List that shall contain 52 card set
	List<Card> listofcards = new ArrayList<Card>();

	//Add all 52 cards with all possible combinations for suits and weights
	public DeckOfCards(List<Card> cardset){

		// for all suits in CardSuit Enum
		for (CardSuit s : CardSuit.values()){	

			// for all card weights in CardWeight Enum
			for (CardWeight w : CardWeight.values()){

				//Generate a card for above weight and suit and
				//add it to the deck of cards
				listofcards.add(new Card(s, w));
			}
		}

	}

	//Empty constructor to generate an empty list of cards
	public DeckOfCards(){
		this(new ArrayList<Card>());
	}

	//Shuffle the cards in the deck in randomly permuted order
	public void shuffle(){

		//if no cards exist in list then give empty list error message
		if(listofcards == null || listofcards.isEmpty()){
			throw new IllegalStateException("List of cards being accessed is empty");
		}

		//start from right higher end towards lower end
		for (int c = listofcards.size() - 1; c > 1; c--){

			//create a random variable that stores a randomly generated number
			Random randomindex;

			//a random number is created between lower end index and
			//the present index
			int rand = randomindex.nextInt(c + 1);

			//create a temporary card object to swap weights between
			//selected random index and unselected higher index
			Card temp = listofcards.get(c);
			listofcards.set(c, listofcards.get(rand));
			listofcards.set(rand, temp);
		}
	}

	//returns the first card from the deck, untill all cards are returned.
	public Card dealOneCard(){
		Card onecard = null;
		if(!listofcards.isEmpty()){
			onecard = listofcards.remove(0);
		}
		return onecard;
	}


	/* EXTRA FUNCTIONALITY FOR TESTING */
	//returns size of the deck of cards - for testing purpose
	public int listSize(){
		return listofcards.size();
	}
}