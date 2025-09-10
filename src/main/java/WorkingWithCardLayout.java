import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WorkingWithCardLayout {
    JFrame mainframe;
    public WorkingWithCardLayout() {
        showMainFrame();
    }
    //creating a method instead of using the constructor
    public void showMainFrame(){
        mainframe=new JFrame("working with cardlayout");
        mainframe.setSize(500,700);
        //CardLayout card=new CardLayout();
        mainframe.setVisible(true);
    };
}