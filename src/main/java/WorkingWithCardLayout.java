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

    public void showMainFrame(){
        mainframe=new JFrame("working with cardlayout");
        mainframe.setSize(500,700);
        mainframe.setLayout(new BorderLayout());
        //CardLayout card=new CardLayout();
        mainframe.setVisible(true);
    }

    public void showcards() {
        cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);
        JPanel cardone = new JPanel();
        cardone.setBackground(Color.RED);
        cardone.add(new JLabel("cardone"));
        JPanel cardtwo = new JPanel();
        cardtwo.setBackground(Color.YELLOW);
        cardtwo.add(new JLabel("cardtwo"));
        JPanel cardthree = new JPanel();
        cardthree.setBackground(Color.GREEN);
        cardthree.add(new JLabel("cardthree"));
        //adding the three cards to the container
        container.add(cardone, "1");
        container.add(cardtwo, "2");
        container.add(cardthree, "3");
        JButton nextcard = new JButton("see next pane");
        JButton prevcard = new JButton("see previous pane");
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
        mainframe.add(container, BorderLayout.CENTER);
        mainframe.add(buttonPanel, BorderLayout.SOUTH);
        mainframe.setVisible(true);


    }
}