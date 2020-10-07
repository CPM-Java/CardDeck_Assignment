
/**
 * Manipulates card objects for objects of the CardGUI class.
 * 
 * @author GrayKnight
 * @version 1/18/04 Modified 11/20/10, 11/19/17
 */

import java.util.Random;

public class CardDealer
{
    // instance variables
    public final int CARDS_IN_A_DECK = 52;
    private int myNumCardsDealt = 0;
    private PlayingCard[] dealersDeck; //ArrayList to hold the cards
    
    /**
     * Constructor for objects of class CardDeck.
     */
    public CardDealer()
    {   
        //complete the instance array of cards
        dealersDeck = new PlayingCard[CARDS_IN_A_DECK];
    }

    /**
     * Creates a new 'deck' of card objects.
     */
    public void newDeck(){ 
        
        //create cards and place in the arraylist dealersDeck
        int cardIndexNumber = 0;
        for (int suit = 1; suit <= 4; suit++){
            for (int number = 2; number <= 14; number++){
                PlayingCard c = new PlayingCard(suit, number);
                dealersDeck[cardIndexNumber] = c;
                cardIndexNumber++;                    
            }//end of number for loop
                 
        }//end of suit for loop
        myNumCardsDealt = 0;

    }//end of newDeck method
    
    /**
     * Performs a 'bunch' of random swaps to 'shuffle' the deck.
     * You may use another 'shuffling' implementation.
     */ 
    public void shuffleDeck(){

       
    }//end of shuffle method

    /**
     * Creates a String representation of the specified number of cards
     * from the deck and updates myNumCardsDealt.
     * 
     * @param  cards   the number of cards to be 'dealt' from the 'deck'
     * @return      a String representation of the specified number of cards
     */     
    public String dealCards(int cards){

        return "Complete the dealCards method";
        
    }//end of dealCards method
    
    /**
     * Creates a String representation of the remaining 'undealt' cards
     * from the deck and updates myNumCardsDealt
     * 
     * @return      a String representation of the remaining cards
     */
    public String dealAllCards()
    {
        return "Complete the dealAllCards method";
        
    }//end of dealAllCards method

}//end of class
