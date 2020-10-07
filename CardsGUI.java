
/**
 * Creates GUI for the Cards Array Assignment.
 * DO NOT MODIFY THIS CLASS
 * 
 * @author GrayKnight 
 * @version 1/19/03, mods 11/22/10, 11/19/17
 */

import javax.swing.*;
import java.awt.*;  //these must be imported for GUI
import java.awt.event.*;

public class CardsGUI extends JPanel
{   
    private String myDisplay = "";
    private CardDealer myDealer;
    private JButton newDeckBtn, shuffleBtn, dealOneBtn, dealFiveBtn, dealAllBtn;
    private JTextArea cardTableText; //shows cards
    /**
     * Constructor for objects of class DiceGUI
     */
    public CardsGUI()
    {  
       myDealer = new CardDealer();
       myDealer.newDeck();
       setLayout(new BorderLayout());
       
	    newDeckBtn = new JButton("New Deck");
       dealOneBtn = new JButton("Deal 1 Card");
       dealFiveBtn = new JButton("Deal 5 Cards");
       dealAllBtn = new JButton("Deal Remaining");
       shuffleBtn = new JButton("Shuffle");
       
       ButtonListener Listener = new ButtonListener();
       newDeckBtn.addActionListener(Listener);
       dealOneBtn.addActionListener(Listener);
       dealFiveBtn.addActionListener(Listener);
       dealAllBtn.addActionListener(Listener);
       shuffleBtn.addActionListener(Listener);
       
       add(newDeckBtn, BorderLayout.NORTH);
       add(dealOneBtn, BorderLayout.WEST);
       add(dealFiveBtn, BorderLayout.CENTER);
       add(dealAllBtn, BorderLayout.EAST);
       add(shuffleBtn, BorderLayout.SOUTH);      
       setSize(400,150);
       setVisible(true);
       
               //TextArea instructions
        cardTableText = new JTextArea();
        Font font = new Font("courier", Font.PLAIN, 14);
        cardTableText.setFont(font);
        Color darkGreen = new Color(0,100,20);//Custom Color
        cardTableText.setForeground(Color.WHITE);
        cardTableText.setBackground(darkGreen);
        
        //Panel instructions
       JFrame tableFrame = new JFrame("Card Table");
        tableFrame.setBackground(darkGreen);
        tableFrame.setPreferredSize(new Dimension(750, 400));
	    tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    tableFrame.getContentPane().add(cardTableText);
	    tableFrame.pack();
        tableFrame.setLocation(20,150);
	    tableFrame.setVisible(true);
       
    }//end of constructor
    
    /**
     * Private Listener Class.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
                        
       if(event.getSource() == newDeckBtn){
         myDealer.newDeck();
         myDisplay = "";
        }
       
       if(event.getSource() == dealAllBtn){
         myDisplay += myDealer.dealAllCards();
       }//end if dealBtn 
            
       if(event.getSource() == dealOneBtn){
         myDisplay += myDealer.dealCards(1);
       }//end if dealBtn
       
       if(event.getSource() == dealFiveBtn){
         myDisplay += myDealer.dealCards(5);
       }//end if dealBtn
       
       if(event.getSource() == shuffleBtn){
         myDealer.shuffleDeck();
         myDisplay = "";
       }//end if shuffleBtn
       
       cardTableText.setText(myDisplay);     
    }//end of ButtonListener
     
    }//end listener class

}//end class
