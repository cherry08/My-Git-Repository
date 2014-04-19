/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public enum CardWeight{
	ACE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	JACK,
	QUEEN,
	KING;
	
	//Weight for card value
	private int wgt;
	
	//Constructor
	private int CardWeight(int wgt){
		this.wgt=wgt;
	}
	
	/* EXTRA FUNCTIONALITY FOR TESTING */
	public int getWeight(){
		return wgt;
	}
}
