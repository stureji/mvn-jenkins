package nord;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App. This test does nothing. Used mostly to provide testing path structure.
 */
public class AppTest{
    @Test
    public void shouldAnswerWithTrue(){
        Assert.assertTrue(true);
    }

    @Test
    public void fail() {
        App app = new App();

        boolean pass = app.willPass();

        Assert.assertTrue(pass);
    }
}
