import java.awt.GraphicsEnvironment;
//best2
public class Main{
    public static void main(String[]args){
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("For Jenkins purposes - skipping UI");
        } else {
            WorkingWithCardLayout cards = new WorkingWithCardLayout();
            cards.showMainFrame();
            cards.showcards();
        }
    }
}
