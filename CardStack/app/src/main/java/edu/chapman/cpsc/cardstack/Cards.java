package edu.chapman.cpsc.cardstack;

/**
 * Created by fried on 10/3/2017.
 */

public class Cards {
    private String cardValue;
    private Suite cardSuite;

    public Cards (String theCard, Suite theSuite){
        cardValue = theCard;
        cardSuite = theSuite;
    }

    public Suite getSuite(){
        return cardSuite;
    }

    public String getCard(){
        return cardValue;
    }
}
