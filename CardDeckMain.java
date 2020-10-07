/**
 * CardDeckMain is the starting point for execution.
 * Contains the code to intitialize the frame
 * DO NOT MODIFY THIS CLASS
 * 
 * @author GrayKnight
 * @version mods 11/21/10, mods 11/19/17
 */

 import javax.swing.JFrame;

public class CardDeckMain
{

	public static void main(String[] ArgsgrA)
	{

	    JFrame buttonFrame = new JFrame("CPM 2017");
	    buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    buttonFrame.getContentPane().add(new CardsGUI());
	    buttonFrame.pack();
	    buttonFrame.setLocation(225,30);
	    buttonFrame.setVisible(true);
	}

}
