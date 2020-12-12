package nord;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App. This test does nothing. Used mostly to provide testing path structure.
 */
public class AppTest{
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

    @Test
    public void stall() {
        for(int i = 0; i < 99999999; i++) {
            double random = Math.random();
            random = random / 2;
            Assert.assertTrue("true", random >= 0);
        }
    }
}
