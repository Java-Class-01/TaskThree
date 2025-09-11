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
        //add ActionListeners to the buttons
        nextcard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(container);
            }
        });
        prevcard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(container);
            }
        });
        //create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevcard);
        buttonPanel.add(nextcard);
        //add the container and button to the jframe(mainframe)
        mainframe.add(container, BorderLayout.CENTER);
        mainframe.add(buttonPanel, BorderLayout.SOUTH);
        //make the frame visible


    }
}