import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WorkingWithCardLayout {
    JFrame mainframe;
    CardLayout cardLayout;
    public WorkingWithCardLayout() {
        showMainFrame();
        showcards();
    }
    //creating a method instead of using the constructor
    public void showMainFrame(){
        mainframe=new JFrame("working with cardlayout");
        mainframe.setSize(500,700);
        //CardLayout card=new CardLayout();
        mainframe.setVisible(true);
    };
    //method to show the three cards
    public void showcards(){
//creating the parent container for the cards
        cardLayout =new CardLayout();
        JPanel container=new JPanel(cardLayout);
        //creating the cards that will be in the container
        JPanel cardone=new JPanel();
        cardone.setBackground(Color.RED);
        cardone.add(new JLabel("cardone"));
        JPanel cardtwo=new JPanel();
        cardtwo.setBackground(Color.YELLOW);
        cardtwo.add(new JLabel("cardtwo"));
        JPanel cardthree=new JPanel();
        cardthree.setBackground(Color.GREEN);
        cardthree.add(new JLabel("cardthree"));
        //adding the three cards to the container
        container.add(cardone,"1");
        container.add(cardtwo,"2");
        container.add(cardthree,"3");
        //creating buttons to switch the cards
        JButton nextcard=new JButton("see next pane");
        JButton prevcard=new JButton("see previous pane");
        //instance of the cardlayout
        CardLayout showingcards=(CardLayout) container.getLayout();
        //Awab create the following:
        //add ActionListeners to the buttons
        //create a panel for the buttons
        //add the container to the jframe(mainframe)
        //add the button panel to the frame
        //make the frame visible


    }
}