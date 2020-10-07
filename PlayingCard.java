
/**
 * This class defines a playing card from a regular deck of 52 cards.
 * DO NOT MODIFY
 * 
 * @author GrayKnight 
 * @version V2 for java  1/18/04 static variables removed 11/21/10 gk
 */
public class PlayingCard
{
    // instance variables
    private int mySuitNum;//1=clubs; 2=spades; 3=hearts; 4=diamonds
    private int myValueNum;//2=duce; 3=three; . . . 13=king; 14=ace
    private boolean validCard;//true if all parameters defined
    private String myFace; //description of card face eg. "Jack of Diamonds"
    private String mySuitName; // "clubs", "hearts" etc
    private String myFaceValue; //number or type of card eg. "duce", "ace", "queen"

    /**
     * Constructors for objects of class Card
     */
    public PlayingCard(){
        mySuitNum = 0;
        myValueNum = 0;
        buildFace();
    }

    public PlayingCard( int s, int v ){
        mySuitNum = s;
        myValueNum = v;
        buildFace();
    }

/**
 * Set method for the suit number.  Initializes the String mySuitName.
 * 
 * @param int s, 1=clubs; 2=spades; 3=hearts; 4=diamonds
 */
    public void setSuit( int s ){
        mySuitNum = s;
        buildFace();
    }

/**
 * Set method for the card value number.  Initializes the String myValueName.
 * 
 * @param int v, 2=duce; 3=three; . . . 13=king; 14=ace
 */
    public void setValue( int v ){
        myValueNum = v;
        buildFace();
    }

/**
 * Get method for the suit number.
 * 
 * @param int s, 1=clubs; 2=spades; 3=hearts; 4=diamonds
 */
    public int getSuit() {
        return mySuitNum;
    }

/**
 * Get method for the card value number.
 * 
 * @return int myValueNum, 2=duce; 3=three. . . 13=king; 14=ace
 */
    public int getValue() {
        return myValueNum;
    }

/**
 * Returns description of card.
 * 
 * @return String myFace
 */
    public String toString() {
        return myFace;
    }

/**
 * Returns boolean indicating if the card has been properly initialized.
 * 
 * @return Boolean validCard
 */
    public boolean isValid() {
        return validCard;
    }

    //private helper method.
    //Assigns strings to myFaceValue and mySuitName from myValueNum and mySuitNum
    //Tests for valid variable entries and validates card.
    //Creates the card description String myFace.
    private void buildFace()
    {
        validCard = true;
        
        switch ( myValueNum ){
        case 2:
            myFaceValue = "Deuce ";
            break;
        case 3:
            myFaceValue = "Three ";
            break;
        case 4:
            myFaceValue = " Four ";
            break;
        case 5:
            myFaceValue = " Five ";
            break;
        case 6:
            myFaceValue = "  Six ";
            break;
        case 7:
            myFaceValue = "Seven ";
            break;
        case 8:
            myFaceValue = "Eight ";
            break;
        case 9:
            myFaceValue = " Nine ";
            break;
        case 10:
            myFaceValue = "  Ten ";
            break;
        case 11:
            myFaceValue = " Jack ";
            break;
        case 12:
            myFaceValue = "Queen ";
            break;
        case 13:
            myFaceValue = " King ";
            break;
        case 14:
            myFaceValue = "  Ace ";
            break;
        default:{
            myFaceValue = "NOT VALID.";
            validCard = false;}
        }//end of value switch

        switch ( mySuitNum ){
        case 1:
            mySuitName = "Clubs   ";
            break;
        case 2:
            mySuitName = "Spades  ";
            break;
        case 3:
            mySuitName = "Hearts  ";
            break;
        case 4:
            mySuitName = "Diamonds";
            break;
        default:{
            mySuitName = " NOT VALID.";
            validCard = false;}
        }//end of suit switch
        
        if (validCard) myFace = myFaceValue + "of " + mySuitName;
        else myFace = "My face value is " + myFaceValue + "  My suit is " 
                            + mySuitName + "  I am not defined.";
        
    }//end of build face method
    
 
}//end of Card class