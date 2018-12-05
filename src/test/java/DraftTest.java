import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-12-05.
 */
public class DraftTest {
    
    @Test
    public void draft() {
        assertThat(System.getProperty("user.name"), is("travis"));
    }
}
