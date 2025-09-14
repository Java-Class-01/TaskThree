import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    @Test
    public void testMainMethodExists() {
        assertDoesNotThrow(() -> {
            Class<?> mainClass = Class.forName("Main");
            assertNotNull(mainClass);
        });
    }
    
    @Test
    public void testMainClassHasMainMethod() {
        try {
            Class<?> mainClass = Class.forName("Main");
            var mainMethod = mainClass.getMethod("main", String[].class);
            assertNotNull(mainMethod);
        } catch (Exception e) {
            fail("Main class should have a main method");
        }
    }
    
    @Test
    public void testMainMethodRunsWithoutException() {
        // Test that main method can be called without throwing exceptions
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }
}

