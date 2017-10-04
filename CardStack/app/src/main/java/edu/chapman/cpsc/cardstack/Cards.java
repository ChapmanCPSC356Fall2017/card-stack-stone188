package edu.chapman.cpsc.cardstack;

/**
 * Created by fried on 10/3/2017.
 */

public class Cards {
    private int cardValue;
    private Suite cardSuite;

    public Cards (Suite theSuite, int theCard){
        cardValue = theCard;
        cardSuite = theSuite;
    }

    public Suite getSuite(){
        return cardSuite;
    }

    public int getCard(){
        return cardValue;
    }
}
