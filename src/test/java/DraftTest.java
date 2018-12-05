import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2018-12-05.
 */
public class DraftTest {
    
    @Test
    public void draft() {
        assertEquals(System.getenv("ENV"), "CI");
    }
}
