import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.*;

public class WorkingWithCardLayoutTest {
    
    private WorkingWithCardLayout cardLayout;
    
    @BeforeEach
    public void setUp() {
        cardLayout = new WorkingWithCardLayout();
    }
    
    @Test
    public void testCardLayoutCreation() {
        assertNotNull(cardLayout);
    }
    
    @Test
    public void testCardLayoutHasMainFrame() {
        assertNotNull(cardLayout.mainframe);
    }
    
    @Test
    public void testCardLayoutHasCardLayout() {
        assertNotNull(cardLayout.cardLayout);
    }
    
    @Test
    public void testMainFrameTitle() {
        assertEquals("working with cardlayout", cardLayout.mainframe.getTitle());
    }
    
    @Test
    public void testMainFrameSize() {
        Dimension expectedSize = new Dimension(500, 700);
        assertEquals(expectedSize, cardLayout.mainframe.getSize());
    }
    
    @Test
    public void testMainFrameIsVisible() {
        // Test that the main frame is visible
        assertTrue(cardLayout.mainframe.isVisible());
    }
    
    @Test
    public void testMainFrameLayout() {
        assertTrue(cardLayout.mainframe.getLayout() instanceof java.awt.BorderLayout);
    }
}

